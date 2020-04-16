package com.bridgelabz.converter.unitconverter.dto;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;

public class UnitConverterDTO {
    UnitConverterEnum mainType;
    UnitConverterSubType initialUnit;
   // UnitConverterSubType.VOLUME initialUnit;
   UnitConverterSubType desiredConversion;
    double value;
    public UnitConverterEnum getMainType() {
        return mainType;
    }

    public void setMainType(UnitConverterEnum mainType) {
        this.mainType = mainType;
    }
    public Enum getInitialUnit() {
        return initialUnit;
    }

    public void setInitialUnit(UnitConverterSubType initialUnit) {
        this.initialUnit = initialUnit;
    }

    public double getDesiredConversion() {
        return desiredConversion.conversionValue;
    }

    public void setDesiredConversion(UnitConverterSubType desiredConversion) {
        this.desiredConversion = desiredConversion;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
