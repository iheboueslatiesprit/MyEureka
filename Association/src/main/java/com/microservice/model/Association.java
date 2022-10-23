package com.microservice.model;



import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "association")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
}
