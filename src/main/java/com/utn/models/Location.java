package com.utn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Matias on 10/07/2018.
 */
@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "latitude", columnDefinition = "double(10,8)", nullable = false)
    private double latitude;

    @Column(name = "longitude", columnDefinition = "double(10,8)", nullable = false)
    private double longitude;
}