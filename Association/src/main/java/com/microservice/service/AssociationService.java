package com.microservice.service;

import com.microservice.model.Association;
import com.microservice.repository.AssociationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AssociationService {

    public Association addAssociation(Association fournisseur);

    public Association retrieveAssociation(Integer id);

    public List<Association> retrieveAllAssociations();



    public void deleteAssociation(Integer id);

    public Association updateAssociation(Association f);


   // List<Tournois> getTournoisAssociation(Association f);




}
