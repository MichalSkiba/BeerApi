package com.michalskiba.beer.Controller;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import com.michalskiba.beer.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;
import java.util.Arrays;
import java.util.List;

@RestController
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

    @RequestMapping("/index")
    public String pokazStrone() {
        return "index";
    }


    @RequestMapping(value = "/all")
    public List<Beer> findAll() {
        return beerRepository.findAll();
    }

    @RequestMapping(value = "/all/{id}")
    public Beer findAllbyID(@PathVariable Integer id) {
        return beerRepository.findBeerById(id);
    }

    @RequestMapping(value = "/foodpairings/search/{phrase}")
    public Beer findFoodParrings(@PathVariable String phrase) {
        return beerRepository.findBeerByFoodPairing(phrase);
    }

    @RequestMapping("/allBeer")
    public List<Beer> getBeerList() {
        return BeerService.getBeerList();
    }

    @RequestMapping("/allBeer/{id}")
    public Beer getBeerList(@PathVariable Integer id) {
        return BeerService.getBeerID(id);
    }

    @POST
    @RequestMapping("/save")
    public Beer saveBeer() {
        Beer cos = new Beer(12, "", "", "", "", "", 12, Arrays.asList("dupa", "zupa"));
        return beerRepository.save(cos);
    }
}
