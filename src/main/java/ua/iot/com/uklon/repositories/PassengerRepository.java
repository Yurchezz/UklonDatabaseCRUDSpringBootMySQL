package ua.iot.com.uklon.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.iot.com.uklon.models.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}
