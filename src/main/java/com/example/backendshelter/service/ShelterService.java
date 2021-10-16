package com.example.backendshelter.service;

import com.example.backendshelter.model.Shelter;
import com.example.backendshelter.repository.ShelterRepository;
import org.springframework.stereotype.Service;

@Service
public class ShelterService {

    private final ShelterRepository shelterRepository;

    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }


    public Shelter save(Shelter shelter) {
        return shelterRepository.save(shelter);
    }
}
