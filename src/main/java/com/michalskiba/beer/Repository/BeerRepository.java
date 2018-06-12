package com.michalskiba.beer.Repository;

import com.michalskiba.beer.Model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("beerRepository")
public interface BeerRepository extends JpaRepository<Beer, Long> {

    public List<Beer> findAll();

    public Beer findBeerById(Integer id);

    public Beer findBeerByFoodPairing(String food);

}
