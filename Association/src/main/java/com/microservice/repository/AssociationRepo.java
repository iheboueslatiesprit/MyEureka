package com.microservice.repository;

import com.microservice.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepo extends JpaRepository<Association, Integer> {

}
