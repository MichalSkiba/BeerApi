package com.michalskiba.beer.services;

import com.michalskiba.beer.Controller.JSONWriter;
import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("beerService")
public class BeerService {

    private BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }

//    public Beer save (Beer beer){
//        return beerRepository.save(beer);
//    }

    public static List<Beer> getBeerList() {
        return JSONWriter.Json();
    }

    public static Beer getBeerID(Integer id) {
        return JSONWriter.Json().stream().filter(beer -> beer.getId().equals(id)).findFirst().get();
    }

    public Iterable<Beer> list() {
        return beerRepository.findAll();
    }

    public Iterable<Beer> save(List<Beer> beers){
        return beerRepository.saveAll(beers);
    }
}
