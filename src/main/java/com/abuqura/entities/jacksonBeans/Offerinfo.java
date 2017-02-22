package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offerinfo {

    @JsonProperty("siteID")
    private String siteid;
    private String language;
    private String currency;

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

}
