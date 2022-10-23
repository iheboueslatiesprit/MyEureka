package com.microservice.controller;

import com.microservice.model.Association;
import com.microservice.model.Tournois;
import com.microservice.service.AssociationService;
import com.microservice.service.TournoisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournois")
public class TournoisController {

    @Autowired
    TournoisService tournoisService;

    @GetMapping("/")
    public String home(){
        return "welcome";
    }


    @GetMapping("/retrieve-all-tournois")
    @ResponseBody
    public List<Tournois> getTournois() {
        List<Tournois> listTournois = tournoisService.retrieveAllTournois();
        return listTournois;

    }


    @GetMapping("/retrieve-tournois/{tournois-id}")
    @ResponseBody
    public Tournois retrieveTournois(@PathVariable("tournois-id") Integer tournoisId) {
        return tournoisService.retrieveTournois(tournoisId);
    }


    @PostMapping("/add-tournois")
    @ResponseBody
    public Tournois addTournois(@RequestBody Tournois a) {
        System.out.println("add tournois" + a);
        Tournois tournois = tournoisService.addTournois(a);
        return tournois;
    }


    @DeleteMapping("/remove-tournois/{tournois-id}")
    @ResponseBody
    public void removeTournois(@PathVariable("tournois-id") Integer tournoisId) {
        tournoisService.deleteTournois(tournoisId);
    }


    @PutMapping("/modify-tournois")
    @ResponseBody
    public Tournois modifyTournois(@RequestBody Tournois tournois) {
        return tournoisService.updateTournois(tournois);
    }



}
