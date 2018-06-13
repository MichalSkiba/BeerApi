package com.michalskiba.beer.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Model.BeerJSON;
import com.michalskiba.beer.Repository.BeerRepository;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONWriter {

    @Autowired
    private  BeerRepository beerRepository;

    public static List<Beer> Json() {
        String sUrl = "https://api.punkapi.com/v2/beers";
        List<Beer> piwa = new ArrayList<>();

        try {
            Client client = Client.create();
            WebResource webResource = client.resource(sUrl);
            ClientResponse BeerJson = webResource.accept("application/json").get(ClientResponse.class);

            if (BeerJson.getStatus() != 200) {
                throw new RuntimeException("Błąd HTTP: " + BeerJson.getStatus());
            }

            String bazaJson = BeerJson.getEntity(String.class);
            ObjectMapper mapper = new ObjectMapper();
            BeerJSON[] beer = mapper.readValue(bazaJson, BeerJSON[].class);
            for (BeerJSON piwo : beer) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println(piwo.getId());
                System.out.println(piwo.getName());
                System.out.println(piwo.getTagline());
                System.out.println(piwo.getFirstBrewed());
                System.out.println(piwo.getDescription());
                System.out.println(piwo.getImageUrl());
                System.out.println(piwo.getIbu());
                System.out.println(piwo.getFoodPairing());

                if (true) {
                    piwa.add(new Beer(piwo.getId(), piwo.getName(), piwo.getTagline(), piwo.getFirstBrewed(), piwo.getDescription(), piwo.getImageUrl(), piwo.getIbu(), piwo.getFoodPairing()));
                } else return piwa;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return piwa;
    }
}