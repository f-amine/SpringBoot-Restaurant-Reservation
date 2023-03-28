package com.app.Restaurant.POJO;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(mappedBy ="series")
    private List<Restaurant> rests;
}
