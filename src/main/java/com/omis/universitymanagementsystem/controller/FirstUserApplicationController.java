package com.omis.universitymanagementsystem.controller;

import com.omis.universitymanagementsystem.exception.ResourceNotFoundException;
import com.omis.universitymanagementsystem.model.FirstUserApplication;
import com.omis.universitymanagementsystem.repository.FirstUserApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class FirstUserApplicationController {
    @Autowired
    private FirstUserApplicationRepository firstUserApplicationRepository;

    /**
     * get all the first user application from the FirstUserApplication table
     */
    @GetMapping("/firstuserapplication")
    public List<FirstUserApplication> getAllFirstUserApplications() {
        return firstUserApplicationRepository.findAll();
    }


    /**
     * get a first user application from the firstUserApplications table using first user application's id
     */
    @GetMapping("/firstuserapplication/{id}")
    public ResponseEntity<FirstUserApplication> getFirstUserApplicationById(@PathVariable(value = "id") Long firstUserApplicationId)
            throws ResourceNotFoundException {
        FirstUserApplication firstuserapplication = firstUserApplicationRepository.findById(firstUserApplicationId)
                .orElseThrow(() -> new ResourceNotFoundException("First User Application not found for this id :: " + firstUserApplicationId));
        return ResponseEntity.ok().body(firstuserapplication);
    }

    /**
     * save a first user application to firstUserApplication table
     */
    @PostMapping("/firstuserapplication")
    public FirstUserApplication createFirstUserApplication(@Valid @RequestBody FirstUserApplication firstuserapplication) {
        return firstUserApplicationRepository.save(firstuserapplication);
    }

}
