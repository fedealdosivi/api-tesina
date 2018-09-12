package com.utn.repositories;

import com.utn.models.Location;
import com.utn.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Matias on 16/08/2018.
 */
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {

    Travel findTravelById(Long id);
    Travel findTravelByFromAndTo(Location from, Location to);
    List<Travel> findTravelsByFrom(Location from);
    List<Travel> findTravelsByTo(Location to);
}
