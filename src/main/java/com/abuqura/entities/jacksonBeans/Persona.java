package com.abuqura.entities.jacksonBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Persona {

    @JsonProperty("personaType")
    private String personatype;

    public void setPersonatype(String personatype) {
        this.personatype = personatype;
    }

    public String getPersonatype() {
        return personatype;
    }

}
