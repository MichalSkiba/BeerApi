package com.michalskiba.beer.Controller;

import com.michalskiba.beer.Model.Food;
import com.michalskiba.beer.Repository.FoodRepository;
import com.michalskiba.beer.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody

public class FoodController {


    @Autowired
    FoodRepository foodRepository;

    @Autowired
    FoodService foodService;

    @RequestMapping(value = "/foodAll")
    public List<Food> findAllFood() {
        return foodRepository.findAll();
    }

    @RequestMapping(value = "/foodAll/{food}")
    public Food findAllbyValue(@PathVariable String food) {
        return foodRepository.findFoodByValue(food);
    }

    @RequestMapping(value = "/f/{food}")
    public List<Food> findFoodPairings(@PathVariable String food) {
        return foodService.findFoodValue(food);
    }


}
