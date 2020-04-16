package com.bridgelabz.converter.unitconverter.baseconverter;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;

import java.lang.reflect.Field;

public class BaseConverter {
    public double getBaseConversionForLength(Enum typeOfEnum,double value){
        if(UnitConverterSubType.INCH == typeOfEnum){
            return value*1/12;
        }
        if(UnitConverterSubType.YARD == typeOfEnum){
            return value*3;
        }
        if(UnitConverterSubType.FEET == typeOfEnum){
            return value*1;
        }
        return 0;
    }

    public double getBaseConversionForVolume(Enum typeOfEnum,double value){
        if(UnitConverterSubType.GALLON == typeOfEnum){
            return value*3.78;
        }
        if(UnitConverterSubType.MILILITRES == typeOfEnum){
            return value*(1/1000.0);
        }
        if(UnitConverterSubType.LITRES == typeOfEnum){
            return value*1;
        }
        return 0;
    }

    public double getBaseConversionForTemperature(UnitConverterSubType typeOfEnum,double value) {
        if(UnitConverterSubType.CELSIUS == typeOfEnum || UnitConverterSubType.FAHRENHEIT == typeOfEnum){
            return value+typeOfEnum.addFactor;
        }
        return 0;
    }
}
