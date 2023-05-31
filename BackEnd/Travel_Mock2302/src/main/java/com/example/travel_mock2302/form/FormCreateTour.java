package com.example.travel_mock2302.form;

import lombok.Data;

@Data
public class FormCreateTour {
    private String codeTour;
    private String itineraryTour;

    private String startingGate;

    private String vehicle;

    private int numberOfPassengers;

    private String description;
}
