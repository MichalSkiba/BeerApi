package com.michalskiba.beer.Repository;

import com.michalskiba.beer.Model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("beerRepository")
public interface BeerRepository extends JpaRepository<Beer, Long> {

}
