package com.bridgelabz.converter.unitconverter.baseconverter;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;

public class BaseConverter {
    public double getBaseConversionForLength(UnitConverterSubType.LENGTH typeOfEnum,double value){
        //FEET
        if(UnitConverterSubType.LENGTH.INCH == typeOfEnum){
            return value*1/12;
        }
        if(UnitConverterSubType.LENGTH.YARD == typeOfEnum){
            return value*3;
        }
        if(UnitConverterSubType.LENGTH.FEET == typeOfEnum){
            return value*1;
        }
        return 0;
    }

    public double getBaseConversionForVolume(UnitConverterSubType.VOLUME typeOfEnum,double value){
        //LITRES
        if(UnitConverterSubType.VOLUME.GALLON == typeOfEnum){
            return value*3.78;
        }
        if(UnitConverterSubType.VOLUME.MILILETRES == typeOfEnum){
            return value*(1/1000.0);
        }
        if(UnitConverterSubType.VOLUME.LITRES == typeOfEnum){
            return value*1;
        }
        return 0;
    }
}
