package com.michalskiba.beer.Controller;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import com.michalskiba.beer.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeerController {

    private final BeerRepository beerRepository;

    @Autowired
    private BeerService beerService;

    @Autowired
    public BeerController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @RequestMapping("/index")
    public String pokazStrone() {
        return "index";
    }

    @RequestMapping ("/all")
    public List<Beer> findAll() {
        return beerRepository.findAll();
    }

    @RequestMapping ("/allBeer")
    public List<Beer> getBeerList() {
        return BeerService.getBeerList();
    }

    @RequestMapping ("/allBeer/{id}")
    public Beer getBeerList(@PathVariable Integer id) {
        return BeerService.getBeerID(id);
    }
}
