package com.utn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Matias on 10/07/2018.
 */
@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idcountry", nullable = false)
    private long id;

    @NotEmpty(message = "Name is required.")
    @Column(name = "name",  columnDefinition = "varchar(100)", nullable = false)
    private String name;
}
