package com.michalskiba.beer.services;

import com.michalskiba.beer.Controller.JSONWriter;
import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("beerService")
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public static List<Beer> getBeerList() {
        return JSONWriter.Json();
    }

    public static Beer getBeerID(Integer id) {
        return JSONWriter.Json().stream().filter(beer -> beer.getId().equals(id)).findFirst().get();
    }

}
