package com.bridgelabz.converter.unitconverter.dto;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;

public class UnitConverterDTO {
    UnitConverterEnum mainType;
    UnitConverterSubType initialUnit;
    UnitConverterSubType desiredConversion;
    double value;
    public UnitConverterEnum getMainType() {
        return mainType;
    }

    public void setMainType(UnitConverterEnum mainType) {
        this.mainType = mainType;
    }
    public UnitConverterSubType getInitialUnit() {
        return initialUnit;
    }

    public void setInitialUnit(UnitConverterSubType initialUnit) {
        this.initialUnit = initialUnit;
    }

    public UnitConverterSubType getDesiredConversion() {
        return desiredConversion;
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
