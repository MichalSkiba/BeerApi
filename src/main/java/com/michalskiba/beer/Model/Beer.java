package com.michalskiba.beer.Model;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@EnableTransactionManagement
@Table
public class Beer {

    @NotNull
    @Id
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String tagline;
    @NotNull
    private String firstBrewed;
    @NotNull
    private String description;
    @NotNull
    private String imageUrl;
    @NotNull
    private Integer ibu;
    @ElementCollection
    @CollectionTable(name = "FOODPARING")
    @OrderColumn
    @Column(name = "FOOD")
    private List<String> foodPairing = null;

    public Beer() {
    }

    public Beer(@NotNull Integer id, @NotNull String name, @NotNull String tagline, @NotNull String firstBrewed, @NotNull String description, @NotNull String imageUrl, @NotNull Integer ibu,  List<String> foodPairing) {
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