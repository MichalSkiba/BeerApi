package com.michalskiba.beer.Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "tagline",
        "first_brewed",
        "description",
        "image_url",
        "ibu",
        "food_pairing"
})
public class Beer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("first_brewed")
    private String firstBrewed;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("ibu")
    private Integer ibu;
    @JsonProperty("food_pairing")
    private List<String> foodPairing = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("first_brewed")
    public String getFirstBrewed() {
        return firstBrewed;
    }

    @JsonProperty("first_brewed")
    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("ibu")
    public Integer getIbu() {
        return ibu;
    }

    @JsonProperty("ibu")
    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    @JsonProperty("food_pairing")
    public List<String> getFoodPairing() {
        return foodPairing;
    }

    @JsonProperty("food_pairing")
    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

//    public Beer(Integer id, String name, String tagline, String firstBrewed, String description, String imageUrl, Integer ibu, List<String> foodPairing) {
//        this.id = id;
//        this.name = name;
//        this.tagline = tagline;
//        this.firstBrewed = firstBrewed;
//        this.description = description;
//        this.imageUrl = imageUrl;
//        this.ibu = ibu;
//        this.foodPairing = foodPairing;
//    }
//
//    @Override
//    public String toString() {
//        return "Beer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", tagline='" + tagline + '\'' +
//                ", firstBrewed='" + firstBrewed + '\'' +
//                ", description='" + description + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
//                ", ibu=" + ibu +
//                ", foodPairing=" + foodPairing +
//                '}';
//    }
}