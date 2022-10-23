package com.microservice.model;
import com.microservice.model.Tournois;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Table(name = "association")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "association")
    Set<Tournois> tournoisList;

}
