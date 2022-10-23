package com.microservice.controller;

import com.microservice.model.Association;
import com.microservice.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/associations")
public class AssociationController {

    @Autowired
    AssociationService associationService;

    @GetMapping("/")
    public String home(){
        return "welcome";
    }


    @GetMapping("/retrieve-all-association")
    @ResponseBody
    public List<Association> getAssociations() {
        List<Association> listfournisseurs = associationService.retrieveAllAssociations();
        return listfournisseurs;

    }


    @GetMapping("/retrieve-association/{association-id}")
    @ResponseBody
    public Association retrieveAssociation(@PathVariable("association-id") Integer AssociationId) {
        return associationService.retrieveAssociation(AssociationId);
    }


    @PostMapping("/add-association")
    @ResponseBody
    public Association addAssociation(@RequestBody Association a) {
        Association association = associationService.addAssociation(a);
        return association;
    }


    @DeleteMapping("/remove-association/{association-id}")
    @ResponseBody
    public void removeAssociation(@PathVariable("association-id") Integer associationId) {
        associationService.deleteAssociation(associationId);
    }

    // http://localhost:8089/SpringMVC/fournisseur/modify-fournisseur
    @PutMapping("/modify-association")
    @ResponseBody
    public Association modifyAssociation(@RequestBody Association association) {
        return associationService.updateAssociation(association);
    }




/*
    @GetMapping("retrive-provider/{provider-id}")
    @ResponseBody
    public Fournisseur getProviderById(@PathVariable("provider-id") Long providerId) {

        return fournisseurService.retriveFournisseur(providerId);
    }

 */

}
