package com.utn.services;

import com.utn.models.Location;
import com.utn.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Matias on 28/08/2018.
 */
@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location save(Location location){
        return locationRepository.save(location);
    }

    public Location save(double latitude, double longitude){
        Location location = new Location();
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        return locationRepository.save(location);
    }

    public Location save(Long id, double latitude, double longitude){
        Location location = locationRepository.findLocationById(id);
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        return locationRepository.save(location);
    }

    public Location findLocationByLatitudeAndLongitude(double lat, double lon){
        return locationRepository.findLocationByLatitudeAndLongitude(lat,lon);
    }

    public Location findLocationById(Long id){
        return findLocationById(id);
    }

    public void delete (Location location){
        locationRepository.delete(location);
    }

    public void delete(Long id){
        locationRepository.deleteById(id);
    }
}
