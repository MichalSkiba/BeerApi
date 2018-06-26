package com.michalskiba.beer.Repository;

import com.michalskiba.beer.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("foodRepository")
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findAll();

    Food findFoodByValue(String food);

}