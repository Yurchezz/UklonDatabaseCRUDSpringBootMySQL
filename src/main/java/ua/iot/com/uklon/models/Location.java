package ua.iot.com.uklon.models;
import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @Column(name = "id_location")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLocation;

    @Column(name = "longitude")
    private Integer Longitude;

    @Column(name = "latitude")
    private Integer Latitude;

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public Integer getLongitude() {
        return Longitude;
    }

    public void setLongitude(Integer longitude) {
        Longitude = longitude;
    }

    public Integer getLatitude() {
        return Latitude;
    }

    public void setLatitude(Integer latitude) {
        Latitude = latitude;
    }
}
