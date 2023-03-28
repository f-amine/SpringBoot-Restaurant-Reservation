package com.app.Restaurant.POJO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;
@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String Lattitude;
    private String Longtitude;
    private LocalTime open;

    private LocalTime close;
    private String adresse;
    private String weekend;
    private int rank;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantSpecialite> restaurantspecialite;

    @OneToOne
    private User user;

    @ManyToOne
    private Zone zones;

    @JsonIgnore
    @ManyToOne
    private Serie series;

    @OneToOne(mappedBy="rest")
    private Photo photos;
}
