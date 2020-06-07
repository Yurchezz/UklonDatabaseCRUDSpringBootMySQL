package ua.iot.com.uklon.models;

import javax.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "id_passenger")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPassenger;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Integer getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(Integer idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
