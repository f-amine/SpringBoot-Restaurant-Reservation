package com.app.Restaurant.POJO;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@IdClass(RestaurantSpecialiteId.class)
public class RestaurantSpecialite {

        @Id
        @ManyToOne
        @JoinColumn(name = "restaurant_id")
        private Restaurant restaurant;


        @Id
        @ManyToOne
        @JoinColumn(name = "specialite_id")
        private Specialite specialite;
}
