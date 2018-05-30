package com.michalskiba.beer.Model;

import java.util.ArrayList;

public class Beer {

    private int punkapiID;
    private String name;
    private String tagline;
    private String firstBrewed;
    private String description;
    private String imageUrl;
    private int ibu;

    ArrayList<String> foodPairing;

    public int getPunkapiID() {
        return punkapiID;
    }

    public void setPunkapiID(int punkapiID) {
        this.punkapiID = punkapiID;
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

    public int getIbu() {
        return ibu;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public ArrayList<String> getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(ArrayList<String> foodPairing) {
        this.foodPairing = foodPairing;
    }
}
