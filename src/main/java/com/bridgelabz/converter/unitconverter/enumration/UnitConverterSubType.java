package com.bridgelabz.converter.unitconverter.enumration;

public class UnitConverterSubType {
    public enum LENGTH{
        INCH(1*12),YARD(1*0.33),FEET(1);

        public final double conversionValue;

        LENGTH(double conversionValue) {
            this.conversionValue = conversionValue;
        }
    }

    public enum VOLUME{
        LITRES(1),MILILETRES(1000),GALLON(1/3.78);
        public final double conversionValue;
        VOLUME(double conversionValue) {
            this.conversionValue = conversionValue;
        }
    }
}
