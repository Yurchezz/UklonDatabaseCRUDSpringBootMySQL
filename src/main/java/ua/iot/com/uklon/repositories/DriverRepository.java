package ua.iot.com.uklon.repositories;


import org.springframework.data.repository.CrudRepository;
import ua.iot.com.uklon.models.Driver;

public interface DriverRepository extends CrudRepository<Driver, Integer> {
}
