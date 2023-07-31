package com.mrfreaktoy.convertidor.Model;

public class Units {
    private String unitsCode;
    private String unitsName;


    public Units(){

    }

    public Units(String unitsCode, String unitsName) {
        this.unitsCode = unitsCode;
        this.unitsName = unitsName;
    }

    public String getUnitsCode() {
        return unitsCode;
    }
    public String getUnitsName() {
        return unitsName;
    }

}
