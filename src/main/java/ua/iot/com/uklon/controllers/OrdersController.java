package ua.iot.com.uklon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.iot.com.uklon.models.Orders;
import ua.iot.com.uklon.repositories.OrdersRepository;

@Controller
@RequestMapping(path="/orders")

public class OrdersController {
    @Autowired
    private OrdersRepository ordersRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewOrder(@RequestParam int idPassenger
            , @RequestParam int idVehicle
            , @RequestParam int driveRate
            , @RequestParam int idStartLocation
            , @RequestParam int idFinalLocation
            , @RequestParam int price
            , @RequestParam int passengerNumber){
        Orders orders = new Orders();

        orders.setIdPassenger(idPassenger);
        orders.setIdVehicle(idVehicle);
        orders.setDriveRate(driveRate);
        orders.setIdStartLocation(idStartLocation);
        orders.setIdFinalLocation(idFinalLocation);
        orders.setPrice(price);
        orders.setPassengerNumber(passengerNumber);
        ordersRepository.save(orders);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Orders> getAllOrders(){
        return ordersRepository.findAll();
    }
}
