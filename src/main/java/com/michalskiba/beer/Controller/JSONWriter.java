package com.michalskiba.beer.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.michalskiba.beer.Model.Beer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.io.IOException;


public class JSONWriter {

    String sUrl = "https://api.punkapi.com/v2/beers";
    {
        try {
            Client client = Client.create();
            WebResource webResource = client.resource(sUrl);
            ClientResponse BeerJson = webResource.accept("application/json").get(ClientResponse.class);

            if (BeerJson.getStatus() != 200) {
                throw new RuntimeException("Błąd HTTP: " + BeerJson.getStatus());
            }

            String bazaJson = BeerJson.getEntity(String.class);
            ObjectMapper mapper = new ObjectMapper();
            Beer[] beer = mapper.readValue(bazaJson, Beer[].class);
            for (Beer piwo : beer) {
                System.out.println("---------------------------------------------------------------------");
                System.out.println(piwo.getId());
                System.out.println(piwo.getName());
                System.out.println(piwo.getTagline());
                System.out.println(piwo.getFirstBrewed());
                System.out.println(piwo.getDescription());
                System.out.println(piwo.getImageUrl());
                System.out.println(piwo.getIbu());
                System.out.println(piwo.getFoodPairing());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}