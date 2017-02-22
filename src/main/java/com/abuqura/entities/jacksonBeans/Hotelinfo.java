package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotelinfo {

    @JsonProperty("hotelId")
    private String hotelid;
    @JsonProperty("hotelName")
    private String hotelname;
    @JsonProperty("hotelDestination")
    private String hoteldestination;
    @JsonProperty("hotelDestinationRegionID")
    private String hoteldestinationregionid;
    @JsonProperty("hotelLongDestination")
    private String hotellongdestination;
    @JsonProperty("hotelStreetAddress")
    private String hotelstreetaddress;
    @JsonProperty("hotelCity")
    private String hotelcity;
    @JsonProperty("hotelProvince")
    private String hotelprovince;
    @JsonProperty("hotelCountryCode")
    private String hotelcountrycode;
    @JsonProperty("hotelLocation")
    private String hotellocation;
    @JsonProperty("hotelLatitude")
    private double hotellatitude;
    @JsonProperty("hotelLongitude")
    private double hotellongitude;
    @JsonProperty("hotelStarRating")
    private String hotelstarrating;
    @JsonProperty("hotelGuestReviewRating")
    private double hotelguestreviewrating;
    @JsonProperty("travelStartDate")
    private String travelstartdate;
    @JsonProperty("travelEndDate")
    private String travelenddate;
    @JsonProperty("hotelImageUrl")
    private String hotelimageurl;
    @JsonProperty("carPackageScore")
    private double carpackagescore;
    private String description;
    @JsonProperty("distanceFromUser")
    private int distancefromuser;
    private String language;
    @JsonProperty("movingAverageScore")
    private double movingaveragescore;
    @JsonProperty("promotionAmount")
    private int promotionamount;
    @JsonProperty("promotionDescription")
    private String promotiondescription;
    @JsonProperty("promotionTag")
    private String promotiontag;
    @JsonProperty("rawAppealScore")
    private double rawappealscore;
    @JsonProperty("relevanceScore")
    private int relevancescore;
    @JsonProperty("statusCode")
    private String statuscode;
    @JsonProperty("statusDescription")
    private String statusdescription;
    @JsonProperty("carPackage")
    private boolean carpackage;
    @JsonProperty("allInclusive")
    private boolean allinclusive;

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHoteldestination(String hoteldestination) {
        this.hoteldestination = hoteldestination;
    }

    public String getHoteldestination() {
        return hoteldestination;
    }

    public void setHoteldestinationregionid(String hoteldestinationregionid) {
        this.hoteldestinationregionid = hoteldestinationregionid;
    }

    public String getHoteldestinationregionid() {
        return hoteldestinationregionid;
    }

    public void setHotellongdestination(String hotellongdestination) {
        this.hotellongdestination = hotellongdestination;
    }

    public String getHotellongdestination() {
        return hotellongdestination;
    }

    public void setHotelstreetaddress(String hotelstreetaddress) {
        this.hotelstreetaddress = hotelstreetaddress;
    }

    public String getHotelstreetaddress() {
        return hotelstreetaddress;
    }

    public void setHotelcity(String hotelcity) {
        this.hotelcity = hotelcity;
    }

    public String getHotelcity() {
        return hotelcity;
    }

    public void setHotelprovince(String hotelprovince) {
        this.hotelprovince = hotelprovince;
    }

    public String getHotelprovince() {
        return hotelprovince;
    }

    public void setHotelcountrycode(String hotelcountrycode) {
        this.hotelcountrycode = hotelcountrycode;
    }

    public String getHotelcountrycode() {
        return hotelcountrycode;
    }

    public void setHotellocation(String hotellocation) {
        this.hotellocation = hotellocation;
    }

    public String getHotellocation() {
        return hotellocation;
    }

    public void setHotellatitude(double hotellatitude) {
        this.hotellatitude = hotellatitude;
    }

    public double getHotellatitude() {
        return hotellatitude;
    }

    public void setHotellongitude(double hotellongitude) {
        this.hotellongitude = hotellongitude;
    }

    public double getHotellongitude() {
        return hotellongitude;
    }

    public void setHotelstarrating(String hotelstarrating) {
        this.hotelstarrating = hotelstarrating;
    }

    public String getHotelstarrating() {
        return hotelstarrating;
    }

    public void setHotelguestreviewrating(double hotelguestreviewrating) {
        this.hotelguestreviewrating = hotelguestreviewrating;
    }

    public double getHotelguestreviewrating() {
        return hotelguestreviewrating;
    }

    public void setTravelstartdate(String travelstartdate) {
        this.travelstartdate = travelstartdate;
    }

    public String getTravelstartdate() {
        return travelstartdate;
    }

    public void setTravelenddate(String travelenddate) {
        this.travelenddate = travelenddate;
    }

    public String getTravelenddate() {
        return travelenddate;
    }

    public void setHotelimageurl(String hotelimageurl) {
        this.hotelimageurl = hotelimageurl;
    }

    public String getHotelimageurl() {
        return hotelimageurl;
    }

    public void setCarpackagescore(double carpackagescore) {
        this.carpackagescore = carpackagescore;
    }

    public double getCarpackagescore() {
        return carpackagescore;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDistancefromuser(int distancefromuser) {
        this.distancefromuser = distancefromuser;
    }

    public int getDistancefromuser() {
        return distancefromuser;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setMovingaveragescore(double movingaveragescore) {
        this.movingaveragescore = movingaveragescore;
    }

    public double getMovingaveragescore() {
        return movingaveragescore;
    }

    public void setPromotionamount(int promotionamount) {
        this.promotionamount = promotionamount;
    }

    public int getPromotionamount() {
        return promotionamount;
    }

    public void setPromotiondescription(String promotiondescription) {
        this.promotiondescription = promotiondescription;
    }

    public String getPromotiondescription() {
        return promotiondescription;
    }

    public void setPromotiontag(String promotiontag) {
        this.promotiontag = promotiontag;
    }

    public String getPromotiontag() {
        return promotiontag;
    }

    public void setRawappealscore(double rawappealscore) {
        this.rawappealscore = rawappealscore;
    }

    public double getRawappealscore() {
        return rawappealscore;
    }

    public void setRelevancescore(int relevancescore) {
        this.relevancescore = relevancescore;
    }

    public int getRelevancescore() {
        return relevancescore;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatusdescription(String statusdescription) {
        this.statusdescription = statusdescription;
    }

    public String getStatusdescription() {
        return statusdescription;
    }

    public void setCarpackage(boolean carpackage) {
        this.carpackage = carpackage;
    }

    public boolean getCarpackage() {
        return carpackage;
    }

    public void setAllinclusive(boolean allinclusive) {
        this.allinclusive = allinclusive;
    }

    public boolean getAllinclusive() {
        return allinclusive;
    }

}
