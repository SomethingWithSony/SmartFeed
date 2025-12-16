package com.smartfeed.app.model;

public enum NutrientType {

    CRUDE_PROTEIN("%"),
    METABOLIZABLE_ENERGY("kcal/kg"),
    CALCIUM("%"),
    PHOSPHORUS("%"),
    LYSINE("%"),
    METHIONINE("%");


    private String unit;

    NutrientType(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
