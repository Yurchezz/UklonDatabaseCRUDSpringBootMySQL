package ua.iot.com.uklon.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.iot.com.uklon.models.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
}
