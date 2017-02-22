package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotelpricinginfo {

    @JsonProperty("averagePriceValue")
    private double averagepricevalue;
    @JsonProperty("totalPriceValue")
    private double totalpricevalue;
    @JsonProperty("originalPricePerNight")
    private String originalpricepernight;
    @JsonProperty("hotelTotalBaseRate")
    private double hoteltotalbaserate;
    @JsonProperty("hotelTotalTaxesAndFees")
    private double hoteltotaltaxesandfees;
    private String currency;
    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    private double hoteltotalmandatorytaxesandfees;
    @JsonProperty("percentSavings")
    private int percentsavings;
    private boolean drr;

    public void setAveragepricevalue(double averagepricevalue) {
        this.averagepricevalue = averagepricevalue;
    }

    public double getAveragepricevalue() {
        return averagepricevalue;
    }

    public void setTotalpricevalue(double totalpricevalue) {
        this.totalpricevalue = totalpricevalue;
    }

    public double getTotalpricevalue() {
        return totalpricevalue;
    }

    public void setOriginalpricepernight(String originalpricepernight) {
        this.originalpricepernight = originalpricepernight;
    }

    public String getOriginalpricepernight() {
        return originalpricepernight;
    }

    public void setHoteltotalbaserate(double hoteltotalbaserate) {
        this.hoteltotalbaserate = hoteltotalbaserate;
    }

    public double getHoteltotalbaserate() {
        return hoteltotalbaserate;
    }

    public void setHoteltotaltaxesandfees(double hoteltotaltaxesandfees) {
        this.hoteltotaltaxesandfees = hoteltotaltaxesandfees;
    }

    public double getHoteltotaltaxesandfees() {
        return hoteltotaltaxesandfees;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setHoteltotalmandatorytaxesandfees(double hoteltotalmandatorytaxesandfees) {
        this.hoteltotalmandatorytaxesandfees = hoteltotalmandatorytaxesandfees;
    }

    public double getHoteltotalmandatorytaxesandfees() {
        return hoteltotalmandatorytaxesandfees;
    }

    public void setPercentsavings(int percentsavings) {
        this.percentsavings = percentsavings;
    }

    public int getPercentsavings() {
        return percentsavings;
    }

    public void setDrr(boolean drr) {
        this.drr = drr;
    }

    public boolean getDrr() {
        return drr;
    }

}
