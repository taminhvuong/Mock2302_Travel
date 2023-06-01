package com.example.travel_mock2302.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fullName;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private int numberAdult;
    @Column
    private int numberChildren;
    @Column
    private Long  priceAll;
    @ManyToOne
    @JoinColumn(name = "codeTrip",nullable = false)
    private Trip trip;
}
