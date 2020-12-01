package com.cf.services;
import com.cf.*;
import com.cf.metier.donationMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DonnRestService {


    /*@RequestMapping(value = "/donnContributer" , method = RequestMethod.POST)
    public List<donation> DonnationByUser(@RequestBody Contributeur contributeur) {
        //return donationMetier.DonationByUser(contributeur);
    }*/

    @Autowired
    private donationMetier donMetier ;

    /*@RequestMapping(value = "/donn" , method = RequestMethod.POST)
    public donation saveDonnation(@RequestBody donation don) {
        don.setDateDonn(new Date());
        //return donationMetier.saveDonnation(don);
    }

    @RequestMapping(value = "/donn" , method = RequestMethod.GET)
    public List<donation> listDonnation() {
        //return donationMetier.listDonnation();
    }

    @RequestMapping(value = "/donnProj" , method = RequestMethod.POST)
    public Long DonnationByProjet(@RequestBody Projet pr) {
        //return donationMetier.DonnationByProjet(pr);
    }

    @RequestMapping(value = "/donnNbrProj" , method = RequestMethod.POST)
    public Long DonnationNbrProjet(@RequestBody Projet pr) {
        //return donationnMetier.DonnationNbrProjet(pr);
    }*/

}
