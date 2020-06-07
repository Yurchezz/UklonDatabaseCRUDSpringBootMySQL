package ua.iot.com.uklon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.iot.com.uklon.models.Passenger;
import ua.iot.com.uklon.repositories.PassengerRepository;

@Controller
@RequestMapping(path="/passengers")

public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewPassenger(@RequestParam String phoneNumber){
        Passenger passenger = new Passenger();

        passenger.setPhoneNumber(phoneNumber);
        passengerRepository.save(passenger);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }
}

