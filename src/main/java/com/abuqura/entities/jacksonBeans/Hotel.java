package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {

    @JsonProperty("offerDateRange")
    private Offerdaterange offerdaterange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("hotelInfo")
    private Hotelinfo hotelinfo;
    @JsonProperty("hotelUrgencyInfo")
    private Hotelurgencyinfo hotelurgencyinfo;
    @JsonProperty("hotelPricingInfo")
    private Hotelpricinginfo hotelpricinginfo;
    @JsonProperty("hotelUrls")
    private Hotelurls hotelurls;
    @JsonProperty("hotelScores")
    private Hotelscores hotelscores;

    public void setOfferdaterange(Offerdaterange offerdaterange) {
        this.offerdaterange = offerdaterange;
    }

    public Offerdaterange getOfferdaterange() {
        return offerdaterange;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setHotelinfo(Hotelinfo hotelinfo) {
        this.hotelinfo = hotelinfo;
    }

    public Hotelinfo getHotelinfo() {
        return hotelinfo;
    }

    public void setHotelurgencyinfo(Hotelurgencyinfo hotelurgencyinfo) {
        this.hotelurgencyinfo = hotelurgencyinfo;
    }

    public Hotelurgencyinfo getHotelurgencyinfo() {
        return hotelurgencyinfo;
    }

    public void setHotelpricinginfo(Hotelpricinginfo hotelpricinginfo) {
        this.hotelpricinginfo = hotelpricinginfo;
    }

    public Hotelpricinginfo getHotelpricinginfo() {
        return hotelpricinginfo;
    }

    public void setHotelurls(Hotelurls hotelurls) {
        this.hotelurls = hotelurls;
    }

    public Hotelurls getHotelurls() {
        return hotelurls;
    }

    public void setHotelscores(Hotelscores hotelscores) {
        this.hotelscores = hotelscores;
    }

    public Hotelscores getHotelscores() {
        return hotelscores;
    }

}
