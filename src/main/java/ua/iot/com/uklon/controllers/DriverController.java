package ua.iot.com.uklon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.iot.com.uklon.models.Driver;
import ua.iot.com.uklon.repositories.DriverRepository;

@Controller
@RequestMapping(path="/drivers")

public class DriverController {
    @Autowired
    private DriverRepository driverRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewDriver(@RequestParam String name
            , @RequestParam String surname
            , @RequestParam String phoneNumber
            , @RequestParam Integer rate){
        Driver driver = new Driver();
        driver.setName(name);
        driver.setSurname(surname);
        driver.setPhoneNumber(phoneNumber);
        driver.setRate(rate);
        driverRepository.save(driver);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }

}
