package com.bridgelabz.converter.unitconverter.enumration;

public enum UnitConverterSubType {
    INCH(1*12),YARD(1*0.33),FEET(1),
    LITRES(1),MILILITRES(1000),GALLON(1/3.78),
    CELSIUS(5/9,-32),FAHRENHEIT(9/5,32);

    public final double conversionValue;
    public final double addFactor;


    UnitConverterSubType(double conversionValue) {
            this.conversionValue = conversionValue;
            addFactor = 0;
    }

    UnitConverterSubType(double conversionValue, double addFactor) {
        this.conversionValue = conversionValue;
        this.addFactor=addFactor;
    }
}
