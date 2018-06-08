package com.michalskiba.beer.services;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("beerService")
public class BeerService {

    @Qualifier("beerRepository")
    @Autowired
    private BeerRepository beerRepository;

    public static List<Beer> getBeerList() {
        return getBeerList();
    }
}
