package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotelurgencyinfo {

    @JsonProperty("airAttachRemainingTime")
    private int airattachremainingtime;
    @JsonProperty("numberOfPeopleViewing")
    private int numberofpeopleviewing;
    @JsonProperty("numberOfPeopleBooked")
    private int numberofpeoplebooked;
    @JsonProperty("numberOfRoomsLeft")
    private int numberofroomsleft;
    @JsonProperty("lastBookedTime")
    private String lastbookedtime;
    @JsonProperty("almostSoldStatus")
    private String almostsoldstatus;
    private String link;
    @JsonProperty("almostSoldOutRoomTypeInfoCollection")
    private List<String> almostsoldoutroomtypeinfocollection;
    @JsonProperty("airAttachEnabled")
    private boolean airattachenabled;

    public void setAirattachremainingtime(int airattachremainingtime) {
        this.airattachremainingtime = airattachremainingtime;
    }

    public int getAirattachremainingtime() {
        return airattachremainingtime;
    }

    public void setNumberofpeopleviewing(int numberofpeopleviewing) {
        this.numberofpeopleviewing = numberofpeopleviewing;
    }

    public int getNumberofpeopleviewing() {
        return numberofpeopleviewing;
    }

    public void setNumberofpeoplebooked(int numberofpeoplebooked) {
        this.numberofpeoplebooked = numberofpeoplebooked;
    }

    public int getNumberofpeoplebooked() {
        return numberofpeoplebooked;
    }

    public void setNumberofroomsleft(int numberofroomsleft) {
        this.numberofroomsleft = numberofroomsleft;
    }

    public int getNumberofroomsleft() {
        return numberofroomsleft;
    }

    public void setLastbookedtime(String lastbookedtime) {
        this.lastbookedtime = lastbookedtime;
    }

    public String getLastbookedtime() {
        return lastbookedtime;
    }

    public void setAlmostsoldstatus(String almostsoldstatus) {
        this.almostsoldstatus = almostsoldstatus;
    }

    public String getAlmostsoldstatus() {
        return almostsoldstatus;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setAlmostsoldoutroomtypeinfocollection(List<String> almostsoldoutroomtypeinfocollection) {
        this.almostsoldoutroomtypeinfocollection = almostsoldoutroomtypeinfocollection;
    }

    public List<String> getAlmostsoldoutroomtypeinfocollection() {
        return almostsoldoutroomtypeinfocollection;
    }

    public void setAirattachenabled(boolean airattachenabled) {
        this.airattachenabled = airattachenabled;
    }

    public boolean getAirattachenabled() {
        return airattachenabled;
    }

}
