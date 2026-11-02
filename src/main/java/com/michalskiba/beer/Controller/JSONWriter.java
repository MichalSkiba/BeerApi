package com.michalskiba.beer.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Model.BeerJSON;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public final class JSONWriter {
    private JSONWriter() {}

    public static List<Beer> Json() throws IOException, InterruptedException {
        // External API may be unavailable; failures must be handled by the caller.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.punkapi.com/v2/beers"))
                .timeout(Duration.ofSeconds(10))
                .header("Accept", "application/json")
                .GET().build();
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new IOException("Upstream HTTP " + response.statusCode());
            }
            BeerJSON[] beers = new ObjectMapper().readValue(response.body(), BeerJSON[].class);
            List<Beer> result = new ArrayList<>();
            for (BeerJSON beer : beers) {
                result.add(new Beer(beer.getId(), beer.getName(), beer.getTagline(),
                        beer.getFirstBrewed(), beer.getDescription(), beer.getImageUrl(),
                        beer.getIbu(), beer.getFoodPairing()));
            }
            return result;
        }
    }
}
