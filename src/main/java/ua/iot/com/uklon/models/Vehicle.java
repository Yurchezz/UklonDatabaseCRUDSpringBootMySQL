package ua.iot.com.uklon.models;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "id_vehicle")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVehicle;

    @Column(name = "mark")
    private String mark;

    @Column(name = "color")
    private String color;

    @Column(name = "number")
    private String number;

    @Column(name = "id_driver")
    private Integer idDriver;

    @Column(name = "max_people_capacity")
    private Integer maxPeopleCapacity;

    @Column(name = "type")
    private String type;

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public Integer getMaxPeopleCapacity() {
        return maxPeopleCapacity;
    }

    public void setMaxPeopleCapacity(Integer maxPeopleCapacity) {
        this.maxPeopleCapacity = maxPeopleCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
