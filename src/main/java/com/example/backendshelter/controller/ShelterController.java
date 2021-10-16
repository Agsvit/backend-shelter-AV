package com.example.backendshelter.controller;

import com.example.backendshelter.controller.request.Create.ShelterCreateRequest;
import com.example.backendshelter.controller.request.Response.ShelterResponseReturn;
import com.example.backendshelter.model.Shelter;
import com.example.backendshelter.service.ShelterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShelterController {

    private final ShelterService shelterService;

    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    @PostMapping(value = "/shelter", consumes = "application/json")
    public ShelterResponseReturn addShelter(@RequestBody ShelterCreateRequest shelterReq) {
        Shelter shelter = Shelter
                .builder()
                .name(shelterReq.getName())
                .capacity(shelterReq.getCapacity())
                .shelterLocation(shelterReq.getShelterLocation())
                .build();
        shelterService.save(shelter);
        ShelterResponseReturn shelterResp = new ShelterResponseReturn();
        shelterResp.setId(shelter.getId());
        shelterResp.setName(shelter.getName());
        shelterResp.setCapacity(shelter.getCapacity());
        shelterResp.setShelterLocation(shelter.getShelterLocation());
        return shelterResp;
    }

}
