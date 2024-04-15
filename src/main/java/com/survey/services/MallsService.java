package com.survey.services;


import org.springframework.stereotype.Service;

import com.survey.entity.Malls;
import com.survey.repo.MallsRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class MallsService {

    private final MallsRepository mallsRepository;

    @Autowired
    public MallsService(MallsRepository mallsRepository) {
        this.mallsRepository = mallsRepository;
    }

    // Method to retrieve all malls
    public List<Malls> getAllMalls() {
        return mallsRepository.findAll();
    }

    // Method to retrieve a mall by ID
    public Malls getMallsById(Long id) {
        Optional<Malls> mallOptional = mallsRepository.findById(id);
        return mallOptional.orElse(null);
    }

    // Method to create a new mall
    public Malls createMalls(Malls malls) {
        return mallsRepository.save(malls);
    }

    // Method to update an existing mall
    public Malls updateMalls(Long id, Malls updatedMall) {
        Optional<Malls> mallOptional = mallsRepository.findById(id);
        if (mallOptional.isPresent()) {
            Malls existingMall = mallOptional.get();
            // Update existing mall fields here
            // For example:
            // existingMall.setLocationId(updatedMall.getLocationId());
            // Update other fields similarly
            return mallsRepository.save(existingMall);
        }
        return null; // Or throw an exception indicating the mall was not found
    }

    // Method to delete a mall by ID
    public void deleteMalls(Long id) {
        mallsRepository.deleteById(id);
    }
}
