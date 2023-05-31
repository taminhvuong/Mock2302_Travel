package com.example.travel_mock2302.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    @Id
    private String codeTrip;
    @Column
    private Date start_date;
    @Column
    private Date end_date;
    @Column
    private float price ;
    @Column(columnDefinition = "bit default 0")
    private int likeTrip;
    @ManyToOne
    @JoinColumn(name = "codeTour",nullable = false)
    private Tour tour;

}
