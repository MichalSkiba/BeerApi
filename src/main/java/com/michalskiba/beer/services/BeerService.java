package com.michalskiba.beer.services;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("beerService")
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Autowired
    private FoodService foodService;

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

    public List<Beer> findBeerbyFood(String food) {
        List<Beer> beerList = new ArrayList<>();
        List<Integer> id = new ArrayList<Integer>();
//        System.out.println(foodService.findFoodValue(food).size());
        int i = (foodService.findFoodValue(food).size());
        for (int j = 0; j <= i - 1; j++) {
//            System.out.println(foodService.findFoodValue(food).listIterator(j).next().getBeer_id());
            id.add(foodService.findFoodValue(food).listIterator(j).next().getBeer_id());
        }

        for (Integer item : id) {
            beerList.add(beerRepository.findBeerById(item));
        }
        return beerList;
    }
}
