package com.utn.services;

import com.utn.models.City;
import com.utn.models.State;
import com.utn.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Matias on 16/08/2018.
 */
@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    /**
     * save.
     */
    public void save(City city){
        cityRepository.save(city);
    }

    /**
     * save 2.
     */
    public void save(String name, State state){
        City city = new City();
        city.setName(name);
        city.setState(state);
        cityRepository.save(city);
    }

    /**
     * update.
     */
    public void save(Long id, String name, State state){
        City city = this.findCityById(id);
        city.setName(name);
        city.setState(state);
        cityRepository.save(city);
    }

    /**
     * delete 1.
     */
    public void delete(Long id){
        cityRepository.delete(this.findCityById(id));
    }

    /**
     * delete 2.
     */
    public void delete(City city){
        cityRepository.delete(city);
    }

    /**
     * find city by id.
     */
    public City findCityById(Long id){
        return findCityById(id);
    }

    /**
     * exists.
     */
    public boolean exists(Long id){
        return cityRepository.existsById(id);
    }
}
