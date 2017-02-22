package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offerdaterange {

    @JsonProperty("travelStartDate")
    private String[] travelstartdate;
    @JsonProperty("travelEndDate")
    private String[] travelenddate;
    @JsonProperty("lengthOfStay")
    private int lengthofstay;

    public void setTravelstartdate(String[] travelstartdate) {
        this.travelstartdate = travelstartdate;
    }

    public String[] getTravelstartdate() {
        return travelstartdate;
    }

    public void setTravelenddate(String[] travelenddate) {
        this.travelenddate = travelenddate;
    }

    public String[] getTravelenddate() {
        return travelenddate;
    }

    public void setLengthofstay(int lengthofstay) {
        this.lengthofstay = lengthofstay;
    }

    public int getLengthofstay() {
        return lengthofstay;
    }

}
