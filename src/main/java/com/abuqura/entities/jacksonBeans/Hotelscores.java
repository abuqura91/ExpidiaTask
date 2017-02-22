package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotelscores {

    @JsonProperty("rawAppealScore")
    private double rawappealscore;
    @JsonProperty("movingAverageScore")
    private double movingaveragescore;

    public void setRawappealscore(double rawappealscore) {
        this.rawappealscore = rawappealscore;
    }

    public double getRawappealscore() {
        return rawappealscore;
    }

    public void setMovingaveragescore(double movingaveragescore) {
        this.movingaveragescore = movingaveragescore;
    }

    public double getMovingaveragescore() {
        return movingaveragescore;
    }

}
