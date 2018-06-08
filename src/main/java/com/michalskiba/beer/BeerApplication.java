package com.michalskiba.beer;

import com.michalskiba.beer.Controller.JSONWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerApplication.class, args);

        String sUrl = "https://api.punkapi.com/v2/beers";

        JSONWriter.Json(sUrl);

    }
}
