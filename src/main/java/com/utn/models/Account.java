package com.utn.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * Created by Matias on 10/07/2018.
 */
@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idaccount", nullable = false)
    private long id;

    @Column(name = "name",columnDefinition = "varchar(50)", nullable = false)
    private String name;

    @Column(name = "surname",columnDefinition = "varchar(50)", nullable = false)
    private String surname;

    @Column(name = "email",columnDefinition = "varchar(100)" , nullable = false)
    private String email;

    @Column(name = "age", columnDefinition = "int(2)",nullable = false)
    private int age;

    @Column(name = "phone", columnDefinition = "int", nullable = false)
    private int phone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_fk", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private City city;


}
