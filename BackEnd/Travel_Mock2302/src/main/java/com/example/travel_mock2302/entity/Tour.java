package com.example.travel_mock2302.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Tour {
    @Id
    private String codeTour;
    @Column(unique = true)
    private String itineraryTour;
    @Column
    private String startingGate;
    @Column
    private String vehicle;
    @Column
    private int numberOfPassengers;
    @Column(columnDefinition="text")
    private String description;
    @OneToMany(mappedBy = "tour")
    private List<Trip> trips;

}
