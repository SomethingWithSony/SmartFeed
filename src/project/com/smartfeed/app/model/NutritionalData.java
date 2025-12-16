package com.smartfeed.app.model;

public class NutritionalData {
    private NutrientType nutrient;

    private double value;

    public NutritionalData(NutrientType nutrient, double value) {
        this.nutrient = nutrient;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public NutrientType getNutrient() {
        return nutrient;
    }

    public String getUnit(){
        return nutrient.getUnit();
    }

    @Override
    public String toString() {
        return nutrient.name() + ": " + value + " " + getUnit();
    }
}
