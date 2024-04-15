package com.survey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.Malls;
import com.survey.services.MallsService;

import java.util.List;

@RestController
@RequestMapping("/malls")
@CrossOrigin(origins = "http://localhost:3000")
public class MallsController {

    private final MallsService mallsService;

    @Autowired
    public MallsController(MallsService mallsService) {
        this.mallsService = mallsService;
    }

    @GetMapping
    public ResponseEntity<List<Malls>> getAllMalls() {
        List<Malls> mallsList = mallsService.getAllMalls();
        return new ResponseEntity<>(mallsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Malls> getMallsById(@PathVariable("id") Long id) {
        Malls malls = mallsService.getMallsById(id);
        return new ResponseEntity<>(malls, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Malls> createMalls(@RequestBody Malls malls) {
        Malls newMalls = mallsService.createMalls(malls);
        return new ResponseEntity<>(newMalls, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Malls> updateMalls(@PathVariable("id") Long id, @RequestBody Malls malls) {
        Malls updatedMalls = mallsService.updateMalls(id, malls);
        return new ResponseEntity<>(updatedMalls, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMalls(@PathVariable("id") Long id) {
        mallsService.deleteMalls(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

