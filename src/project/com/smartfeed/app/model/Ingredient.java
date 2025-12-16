package com.smartfeed.app.model;

import java.util.ArrayList;

public class Ingredient {
    int id;
    StringBuffer name;
    float unitPrice;
    MeasurementUnit measurementUnit;
    ArrayList<NutritionalData> nutritionalData;

    public Ingredient(int id, StringBuffer name, float unitPrice, MeasurementUnit measurementUnit) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.measurementUnit = measurementUnit;
        this.nutritionalData = new ArrayList<>();
    }

    public void addNutrient(NutrientType nutrientType, double value){
        NutritionalData data = new NutritionalData(nutrientType,value);
        this.nutritionalData.add(data);
    }
}
