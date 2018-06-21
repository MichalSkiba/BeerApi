//package com.michalskiba.beer.Model;
//
//import org.springframework.stereotype.Indexed;
//
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Indexed
//public class Food {
//
//    @Id
//    private Integer id;
//
//    @ElementCollection
//    private List<String> foodPairing = new ArrayList<String>();
//
//    Food(){}
//
//    public Food(Integer id, List<String> foodPairing) {
//        this.id = id;
//        this.foodPairing = foodPairing;
//    }
//
//    public List<String> getFoodPairing() {
//        return foodPairing;
//    }
//
//    public void setFoodPairing(List<String> foodPairing) {
//        this.foodPairing = foodPairing;
//    }
//
//}
//
