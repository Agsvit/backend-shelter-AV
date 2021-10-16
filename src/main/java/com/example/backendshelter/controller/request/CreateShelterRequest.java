package com.example.backendshelter.controller.request;

import com.example.backendshelter.model.ShelterLocation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateShelterRequest {

    private String name;
    private int capacity;
    private ShelterLocation shelterLocation;
}
