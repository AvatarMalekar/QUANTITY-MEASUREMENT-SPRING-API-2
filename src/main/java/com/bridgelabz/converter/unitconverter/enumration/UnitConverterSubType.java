package com.bridgelabz.converter.unitconverter.enumration;

public enum UnitConverterSubType {
    INCH(1*12),YARD(1*0.33),FEET(1),
    LITRES(1),MILILETRES(1000),GALLON(1/3.78);
    public final double conversionValue;

    UnitConverterSubType(double conversionValue) {
            this.conversionValue = conversionValue;
        }
}
