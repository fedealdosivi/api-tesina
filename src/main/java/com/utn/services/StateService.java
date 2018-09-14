package com.utn.services;

import com.utn.models.Country;
import com.utn.models.State;
import com.utn.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matias on 16/08/2018.
 */
@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public State save(State state){
        return stateRepository.save(state);
    }

    public State save(String name, Country country){
        State state = new State();
        state.setName(name);
        state.setCountry(country);
        return stateRepository.save(state);
    }

    public State save(Long id, String name, Country country){
        State state = stateRepository.findStateById(id);
        state.setName(name);
        state.setCountry(country);
        return stateRepository.save(state);
    }

    public void delete(Long id){
        stateRepository.deleteById(id);
    }

    public void delete(State state){
        stateRepository.delete(state);
    }

    public List<State> findStatesByCountryId(Long id){
        return stateRepository.findStatesByCountry_Id(id);
    }
}
