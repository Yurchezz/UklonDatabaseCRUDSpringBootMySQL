package ua.iot.com.uklon.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.iot.com.uklon.models.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
