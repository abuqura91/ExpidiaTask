package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonRootBean {

    @JsonProperty("offerInfo")
    private Offerinfo offerinfo;
    @JsonProperty("userInfo")
    private Userinfo userinfo;
    private Offers offers;

    public void setOfferinfo(Offerinfo offerinfo) {
        this.offerinfo = offerinfo;
    }

    public Offerinfo getOfferinfo() {
        return offerinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    public Offers getOffers() {
        return offers;
    }

}
