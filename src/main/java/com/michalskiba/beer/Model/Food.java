package com.michalskiba.beer.Model;

import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Indexed
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer beer_id;
    @Column(name = "food_value")
    private String value;
    private Integer hash;

    protected Food() {
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

    @Override
    public String toString() {
        return "{" +
                "beer_id=" + beer_id +
                ", value='" + value + '\'' +
                '}';
    }
}

