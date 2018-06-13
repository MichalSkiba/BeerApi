package com.michalskiba.beer.Model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Beer {

    @NotNull
    @Id
    private Integer id;
    private String name;
    private String tagline;
    private String firstBrewed;
    @Column(length = 1000)
    private String description;
    private String imageUrl;
    private Integer ibu;

    @Embedded
    @ElementCollection
    @CollectionTable(name = "FOODPARING")
    @OrderColumn
    @Column(name = "FOOD")
    private List<String> foodPairing = new ArrayList<>();

    public Beer() {
    }

    public Beer(@NotNull Integer id, String name, String tagline, String firstBrewed, String description, String imageUrl, Integer ibu, List<String> foodPairing) {
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.firstBrewed = firstBrewed;
        this.description = description;
        this.imageUrl = imageUrl;
        this.ibu = ibu;
        this.foodPairing = foodPairing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    public List<String> getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

}