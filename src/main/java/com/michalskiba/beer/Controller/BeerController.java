package com.michalskiba.beer.Controller;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import com.michalskiba.beer.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.POST;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
@ResponseBody

public class BeerController {


    @Autowired
    BeerRepository beerRepository;

    @Autowired
    BeerService beerService;

    @GetMapping("/list")
    public Iterable<Beer> list() {
        return beerService.list();
    }

    @RequestMapping(value = "/all")
    public List<Beer> findAll() {
        return beerRepository.findAll();
    }

    @RequestMapping(value = "/all/{id}")
    public Beer findAllbyID(@PathVariable Integer id) {
        return beerRepository.findBeerById(id);
    }

    @RequestMapping(value = "/food/{food}")
    public List<Beer> findFoodPairings(@PathVariable String food) {
        return beerService.findFoodParing(food);
    }

    @RequestMapping(value = "/fo/{food}")
    public List<Beer> findFoodBeer(@PathVariable String food) {
        return beerService.findBeerbyFood(food);
    }

    @POST
    @RequestMapping("/save")
    public Beer saveBeer() {
        Beer cos = new Beer(120, "", "", "", "", "", 12, asList("zupa", "dupa"));
        return beerRepository.save(cos);
    }
}
