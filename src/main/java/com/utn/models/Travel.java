package com.utn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Matias on 10/07/2018.
 */
@Entity
@Table(name = "travels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_location_fk", nullable = false)
    private Location from;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_location_fk", nullable = false)
    private Location to;

}
