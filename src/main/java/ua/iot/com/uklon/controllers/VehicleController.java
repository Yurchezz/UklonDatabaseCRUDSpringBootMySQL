package ua.iot.com.uklon.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.iot.com.uklon.models.Vehicle;
import ua.iot.com.uklon.repositories.VehicleRepository;

@Controller
@RequestMapping(path="/vehicles")

public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewVehicle(@RequestParam String mark
            , @RequestParam String color
            , @RequestParam String number
            , @RequestParam String type
            , @RequestParam int idVehicle
            , @RequestParam int idDriver
            , @RequestParam int maxPeopleCapacity){
        Vehicle vehicle = new Vehicle();
        vehicle.setMark(mark);
        vehicle.setColor(color);
        vehicle.setNumber(number);
        vehicle.setType(type);
        vehicle.setIdVehicle(idVehicle);
        vehicle.setIdDriver(idDriver);
        vehicle.setMaxPeopleCapacity(maxPeopleCapacity);
        vehicleRepository.save(vehicle);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }
}
