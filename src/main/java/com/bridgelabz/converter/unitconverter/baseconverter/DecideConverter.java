package com.bridgelabz.converter.unitconverter.baseconverter;

import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;

public class DecideConverter {
    UnitConverterEnum unitConverterEnum;
    BaseConverter baseConverter=new BaseConverter();
    UnitConverterEnum mainType;
    UnitConverterDTO unitConverterDTO;

    public DecideConverter(UnitConverterDTO unitConverterDTO) {
       this.unitConverterDTO=unitConverterDTO;
    }

    public double getMeValueAfterConversion() {
        if(unitConverterDTO.getMainType()==UnitConverterEnum.LENGTH){
            return baseConverter.getBaseConversionForLength(unitConverterDTO.getInitialUnit(),unitConverterDTO.getValue());
        }
        return 0;
    }
}
