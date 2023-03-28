package com.app.Restaurant.POJO;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "specialite")
    private List<RestaurantSpecialite> restaurantspecialite;
}
