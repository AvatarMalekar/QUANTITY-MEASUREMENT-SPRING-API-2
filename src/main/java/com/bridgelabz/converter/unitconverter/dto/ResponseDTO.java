package com.bridgelabz.converter.unitconverter.dto;

import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import org.springframework.boot.autoconfigure.domain.EntityScan;


public class ResponseDTO {
    public UnitConverterEnum mainUnit;
    public double initialValue;
    public Enum initialUnit;
    public Enum desiredConversionUnit;
    public double conversionValue;

    public ResponseDTO(UnitConverterDTO unitConverterDTO,double conversionValue) {
        this.conversionValue=conversionValue;
        this.initialValue= unitConverterDTO.getValue();
        this.mainUnit= unitConverterDTO.getMainType();
        this.initialUnit= unitConverterDTO.getInitialUnit();
        this.desiredConversionUnit= unitConverterDTO.getDesiredConversionType();
    }

}
