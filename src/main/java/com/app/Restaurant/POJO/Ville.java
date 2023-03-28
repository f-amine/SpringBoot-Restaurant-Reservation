package com.app.Restaurant.POJO;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@NamedQuery(name="Ville.getAllVille", query = "select v from Ville v")
@NamedQuery(name="Ville.getAllZoneForVille", query = "select z from Zone z join z.ville v where v.nom = :ville")
@NamedQuery(name="Ville.getAllRestaurantsForZone", query = "select r from Restaurant r join r.zones z join z.ville v where v.nom = :ville and z.nom = :zoneName")


@Data
@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    @JsonIgnore
    @OneToMany(mappedBy = "ville")
    private List<Zone> zones;
}
