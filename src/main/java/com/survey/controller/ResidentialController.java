package com.survey.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.Residential;
import com.survey.services.ResidentialService;

@RestController
@RequestMapping("/residentials")
@CrossOrigin
public class ResidentialController {

    @Autowired
    private ResidentialService residentialService;

    @PostMapping("/add")
    public Residential createResidential(@RequestBody Residential residential) {
        return residentialService.createResidential(residential);
    }

    // Add other CRUD operations as needed
}
