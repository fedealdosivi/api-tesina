package com.utn.repositories;

import com.utn.models.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Matias on 16/08/2018.
 */
@Repository
public interface StateRepository extends CrudRepository<State,Long>{

    State findStateById(Long id);
    State findStateByName(String name);
    List<State> findStatesByCountry_Id(Long id);
}
