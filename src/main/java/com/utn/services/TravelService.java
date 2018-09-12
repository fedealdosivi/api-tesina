package com.utn.services;

import com.utn.models.Location;
import com.utn.models.Travel;
import com.utn.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matias on 12/09/2018.
 */
@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;

    public void save(Travel travel) {
        travelRepository.save(travel);
    }

    public void save(Location from, Location to){
        Travel travel = new Travel();
        travel.setFrom(from);
        travel.setTo(to);
        travelRepository.save(travel);
    }

    public void save(Long id, Location from, Location to){
        Travel travel = travelRepository.findTravelById(id);
        travel.setFrom(from);
        travel.setTo(to);
        travelRepository.save(travel);
    }

    public void delete(Travel travel){travelRepository.delete(travel);}

    public Travel findTravelById(Long id){return travelRepository.findTravelById(id);}

    public List<Travel> findTravelsByFrom(Location from){return travelRepository.findTravelsByFrom(from);}

    public List<Travel> findTravelsByTo(Location to){return travelRepository.findTravelsByFrom(to);}
}
