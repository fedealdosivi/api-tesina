package com.utn.services;

import com.utn.models.City;
import com.utn.models.State;
import com.utn.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matias on 16/08/2018.
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    /**
     * save.
     */
    public City save(City city){
        return cityRepository.save(city);
    }

    /**
     * save 2.
     */
    public City save(String name, State state){
        City city = new City();
        city.setName(name);
        city.setState(state);
        return cityRepository.save(city);
    }

    /**
     * update.
     */
    public City save(Long id, String name, State state){
        City city = this.findCityById(id);
        city.setName(name);
        city.setState(state);
        return cityRepository.save(city);
    }

    /**
     * delete 1.
     */
    public void delete(Long id){
        cityRepository.deleteById(id);
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
     * find all.
     */
    public List<City> findAll(){
        return cityRepository.findAll();
    }

    /**
     * exists.
     */
    public boolean exists(Long id){
        return cityRepository.existsById(id);
    }
}
