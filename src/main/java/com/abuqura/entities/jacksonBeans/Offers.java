package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offers {

    @JsonProperty("Hotel")
    private ArrayList<Hotel> hotel;

    public void setHotel(ArrayList<Hotel> hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Hotel> getHotel() {
        return hotel;
    }

}
