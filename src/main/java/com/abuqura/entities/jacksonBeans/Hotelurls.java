package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotelurls {

    @JsonProperty("hotelInfositeUrl")
    private String hotelinfositeurl;
    @JsonProperty("hotelSearchResultUrl")
    private String hotelsearchresulturl;

    public void setHotelinfositeurl(String hotelinfositeurl) {
        this.hotelinfositeurl = hotelinfositeurl;
    }

    public String getHotelinfositeurl() {
        return hotelinfositeurl;
    }

    public void setHotelsearchresulturl(String hotelsearchresulturl) {
        this.hotelsearchresulturl = hotelsearchresulturl;
    }

    public String getHotelsearchresulturl() {
        return hotelsearchresulturl;
    }

}
