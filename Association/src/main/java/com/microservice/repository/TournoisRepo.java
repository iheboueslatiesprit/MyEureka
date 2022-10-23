package com.microservice.repository;

import com.microservice.model.Association;
import com.microservice.model.Tournois;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournoisRepo extends JpaRepository<Tournois, Integer> {
}
