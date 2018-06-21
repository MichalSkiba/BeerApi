package com.michalskiba.beer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.services.BeerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class BeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(BeerService beerService) {
        return args -> {
            // read json and write to db

            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Beer>> typeReference = new TypeReference<List<Beer>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/beer.json");
//            InputStream inputStream = TypeReference.class.getResourceAsStream("c:/test.json");
            try {
                List<Beer> beers = mapper.readValue(inputStream, typeReference);
                beerService.save(beers);
                System.out.println("Beer Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save beers: " + e.getMessage());
            }
        };
    }
}
