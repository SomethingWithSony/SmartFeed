package com.smartfeed.app.model;

public enum MeasurementUnit {
    // Definition: (Visible name, multiplier to turn into the definition)
    KILOGRAM("kg", 1.0),
    TONNE("t", 1000.0),
    GRAM("g", 0.001);

    private String symbol;
    private double factorToKg;

    MeasurementUnit(String symbol, double factorToKg){
        this.symbol = symbol;
        this.factorToKg = factorToKg;
    }

    public double convertToKg(double value){
        return value * factorToKg;
    }

    public double normalizePriceToKG(double price){
        return price / factorToKg;
    }

    public String getSymbol() {
        return symbol;
    }
}
