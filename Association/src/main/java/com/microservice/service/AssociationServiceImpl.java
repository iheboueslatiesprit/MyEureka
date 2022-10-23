package com.microservice.service;

import com.microservice.model.Association;
import com.microservice.repository.AssociationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AssociationServiceImpl implements AssociationService {

    @Autowired
    AssociationRepo associationRepo;

    /*public AssociationServiceImpl(AssociationRepo associationRepo) {
        this.associationRepo = associationRepo;
    }
    */
    @Transactional
    public Association addAssociation(Association association) {
        // TODO Auto-generated method stub
        return this.associationRepo.save(association);
    }

    @Override
    public Association retrieveAssociation(Integer id) {
        return this.associationRepo.findById(id).orElse(null);
    }

    @Override
    public List<Association> retrieveAllAssociations() {
        return (List<Association>) associationRepo.findAll();
    }

    @Override
    public void deleteAssociation(Integer id) {
        associationRepo.deleteById(id);
    }

    @Override
    public Association updateAssociation(Association f) {
        return associationRepo.save(f);

    }

 /*   @Override
    public List<Entrepot> getEntrepotsFournisseurs(Fournisseur f) {
        // TODO Auto-generated method stub
        return entrepotrepository.getentrepotparfournisseur(f);

    }
    */



}
