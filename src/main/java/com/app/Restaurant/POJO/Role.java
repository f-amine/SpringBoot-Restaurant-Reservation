package com.app.Restaurant.POJO;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String libelle;

    @ManyToMany(mappedBy = "roles")
    private List<User> user;
}
