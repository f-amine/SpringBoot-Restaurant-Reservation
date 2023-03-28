package com.app.Restaurant.POJO;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
public class Photo {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String url;
    @OneToOne
    private Restaurant rest;
}
