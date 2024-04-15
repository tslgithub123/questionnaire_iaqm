package com.survey.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.OfficeB;
import com.survey.repo.OfficeBRepository;

import java.util.List;

@Service
public class OfficeBService {

    private final OfficeBRepository officeBRepository;

    @Autowired
    public OfficeBService(OfficeBRepository officeBRepository) {
        this.officeBRepository = officeBRepository;
    }

    public List<OfficeB> getAllOfficeB() {
        // Implement logic to retrieve all OfficeB entries
        return officeBRepository.findAll();
    }

    public OfficeB getOfficeBById(Long id) {
        // Implement logic to retrieve an OfficeB entry by its ID
        return officeBRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("OfficeB entry not found with id: " + id));
    }

    public OfficeB createOfficeB(OfficeB officeB) {
        // Implement logic to create a new OfficeB entry
        return officeBRepository.save(officeB);
    }

    public OfficeB updateOfficeB(Long id, OfficeB officeB) {
        // Implement logic to update an existing OfficeB entry
        OfficeB existingOfficeB = officeBRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("OfficeB entry not found with id: " + id));

        // Set properties of existingOfficeB with values from officeB
        // Example: existingOfficeB.setName(officeB.getName());
        
        return officeBRepository.save(existingOfficeB);
    }

    public void deleteOfficeB(Long id) {
        // Implement logic to delete an existing OfficeB entry
        officeBRepository.deleteById(id);
    }
}

