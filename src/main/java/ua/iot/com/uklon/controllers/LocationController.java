package ua.iot.com.uklon.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.iot.com.uklon.models.Location;
import ua.iot.com.uklon.repositories.LocationRepository;

@Controller
@RequestMapping(path="/locations")
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewLocation(@RequestParam int Longitude
            , @RequestParam int Latitude){
        Location location = new Location();
        location.setLatitude(Latitude);
        location.setLongitude(Longitude);
        locationRepository.save(location);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Location> getAllLocations(){
        return locationRepository.findAll();
    }
}
