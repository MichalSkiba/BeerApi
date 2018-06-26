package com.michalskiba.beer.services;

import com.michalskiba.beer.Model.Beer;
import com.michalskiba.beer.Model.Food;
import com.michalskiba.beer.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("foodService")
public class FoodService {

    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findFoodValue(String food) {
        List<Food> foodList =  foodRepository.findAll().stream().filter(f -> f.getValue().contains(food)).collect(Collectors.toList());
//                .forEach(System.out::println);
        return foodList;
    }
}
