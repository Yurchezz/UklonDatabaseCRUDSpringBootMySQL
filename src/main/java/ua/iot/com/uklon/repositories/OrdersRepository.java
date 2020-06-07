package ua.iot.com.uklon.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.iot.com.uklon.models.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer>{

}
