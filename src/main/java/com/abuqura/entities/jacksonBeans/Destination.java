package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Destination {

    @JsonProperty("regionID")
    private String regionid;
    @JsonProperty("longName")
    private String longname;
    private String country;
    private String province;
    private String city;

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getLongname() {
        return longname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
