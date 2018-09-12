package com.utn.services;

import com.utn.models.Country;
import com.utn.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matias on 16/08/2018.
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public void save(Country country){
        countryRepository.save(country);
    }

    public void save(String name){
        Country country = new Country();
        country.setName(name);
        countryRepository.save(country);
    }

    public void save(Long id, String name){
        Country country = countryRepository.findCountryById(id);
        country.setName(name);
        countryRepository.save(country);
    }

    public void delete(Long id){
        countryRepository.delete(countryRepository.findCountryById(id));
    }

    public void delete(Country country){
        countryRepository.delete(country);
    }

    public Country findCountryById(Long id){
        return countryRepository.findCountryById(id);
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

}
