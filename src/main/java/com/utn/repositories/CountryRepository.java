package com.utn.repositories;

import com.utn.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matias on 16/08/2018.
 */
@Repository
public interface CountryRepository extends CrudRepository<Country,Long>{
}
