package com.microservice.service;

import com.microservice.model.Tournois;
import com.microservice.repository.TournoisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournoisServiceImpl implements TournoisService {

    @Autowired
    TournoisRepo tournoisRepo;

    @Override
    public Tournois addTournois(Tournois tournois) {
        return tournoisRepo.save(tournois);
    }

    @Override
    public Tournois retrieveTournois(Integer id) {

        return tournoisRepo.findById(id).get();
    }

    @Override
    public List<Tournois> retrieveAllTournois() {

        return (List<Tournois>) tournoisRepo.findAll();
    }

    @Override
    public void deleteTournois(Integer id) {
     tournoisRepo.deleteById(id);
    }

    @Override
    public Tournois updateTournois(Tournois f) {
        return tournoisRepo.save(f);
    }

}
