package ua.iot.com.uklon.models;
import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
    @Column(name = "id_order")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrder;

    @Column(name = "id_passenger")
    private int idPassenger;

    @Column(name = "id_vehicle")
    private int idVehicle;

    @Column(name = "drive_rate")
    private int driveRate;

    @Column(name = "id_start_location")
    private int idStartLocation;

    @Column(name = "id_final_location")
    private int idFinalLocation;

    @Column(name = "price")
    private int price;

    @Column(name = "passenger_number")
    private int passengerNumber;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getDriveRate() {
        return driveRate;
    }

    public void setDriveRate(int driverRate) {
        this.driveRate = driverRate;
    }

    public int getIdStartLocation() {
        return idStartLocation;
    }

    public void setIdStartLocation(Integer idStartLocation) {
        this.idStartLocation = idStartLocation;
    }

    public int getIdFinalLocation() {
        return idFinalLocation;
    }

    public void setIdFinalLocation(int idFinalLocation) {
        this.idFinalLocation = idFinalLocation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
