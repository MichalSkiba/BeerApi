package com.michalskiba.beer.Repository;

import com.michalskiba.beer.Controller.JSONWriter;
import com.michalskiba.beer.Model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("beerRepository")
public interface BeerRepository extends JpaRepository<Beer, Long> {

    List<Beer> findAll();

    Beer findBeerById(Integer id);

    public static void main(String[] args) {

        String food = "New";
        JSONWriter.Json().stream().filter(b -> b.getFoodPairing()
                .contains(food))
                .forEach(System.out::println);
    }

}