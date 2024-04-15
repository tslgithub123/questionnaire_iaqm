package com.survey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.OfficeB;
import com.survey.services.OfficeBService;

import java.util.List;

@RestController
@RequestMapping("/api/officeb")
@CrossOrigin
public class OfficeBController {

    private final OfficeBService officeBService;

    @Autowired
    public OfficeBController(OfficeBService officeBService) {
        this.officeBService = officeBService;
    }

    @PostMapping("/add")
    public OfficeB createOfficeB(@RequestBody OfficeB officeB) {
        // Implement logic to create a new OfficeB entry
        return officeBService.createOfficeB(officeB);
    }

 

    @DeleteMapping("/{id}")
    public void deleteOfficeB(@PathVariable Long id) {
        // Implement logic to delete an existing OfficeB entry
        officeBService.deleteOfficeB(id);
    }
}

