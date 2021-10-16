package com.example.backendshelter.exception;

public class ShelterNotFound extends RuntimeException {
    public ShelterNotFound(String message) {
        super("Shelter Not Found");
    }
}
