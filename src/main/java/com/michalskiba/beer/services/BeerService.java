package com.michalskiba.beer.services;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("beerService")
public class BeerService {

    private BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public Iterable<Beer> list() {
        return beerRepository.findAll();
    }

    public Iterable<Beer> save(List<Beer> beers) {
        return beerRepository.saveAll(beers);
    }

    public List<Beer> findFoodParing(String food) {
        List<Beer> beerList = beerRepository.findAll().stream().filter(beer -> beer.getFoodPairing().contains(food)).collect(Collectors.toList());
//                .forEach(System.out::println);
        return beerList;
    }
}
