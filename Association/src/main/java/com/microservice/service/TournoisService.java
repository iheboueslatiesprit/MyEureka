package com.microservice.service;

import com.microservice.model.Association;
import com.microservice.model.Tournois;

import java.util.List;

public interface TournoisService {

    public Tournois addTournois(Tournois tournois);

    public Tournois retrieveTournois(Integer id);

    public List<Tournois> retrieveAllTournois();



    public void deleteTournois(Integer id);

    public Tournois updateTournois(Tournois f);

}
