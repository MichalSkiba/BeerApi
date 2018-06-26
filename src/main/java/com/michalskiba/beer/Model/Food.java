package com.michalskiba.beer.Model;

import org.springframework.stereotype.Indexed;

import javax.persistence.*;

@Entity
@Indexed
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer beer_id;
    private String value;
    private Integer hash;

    Food() {
    }

    public Food(Integer beer_id, String value) {
        this.beer_id = beer_id;
        this.value = value;
    }

    public Integer getBeer_id() {
        return beer_id;
    }

    public void setBeer_id(Integer beer_id) {
        this.beer_id = beer_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

