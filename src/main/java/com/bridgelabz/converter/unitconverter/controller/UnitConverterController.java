package com.bridgelabz.converter.unitconverter.controller;

import com.bridgelabz.converter.unitconverter.dto.ResponseDTO;
import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;
import com.bridgelabz.converter.unitconverter.service.IUnitConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnitConverterController {
    @Autowired
    IUnitConverterService iUnitConverterService;

    @GetMapping("unit/type")
    List getMeAllTypes(){
        return iUnitConverterService.getAllUnits();
    }
    @GetMapping("unit/subtype")
    List getMeSubTypes(){
        return iUnitConverterService.getMeSubUnits();
    }

    @GetMapping("unit/convert")
    ResponseDTO getConvertedUnit(@RequestParam(value = "MType") UnitConverterEnum mainType, @RequestParam(value = "iUnit") UnitConverterSubType initialUnit , @RequestParam(value="dConvUnint") UnitConverterSubType desiredConversion, @RequestParam(value="UValue")double value ){
        UnitConverterDTO unitConverterDTO=new UnitConverterDTO();
        unitConverterDTO.setMainType(mainType);
        unitConverterDTO.setInitialUnit(initialUnit);
        unitConverterDTO.setDesiredConversion(desiredConversion);
        unitConverterDTO.setValue(value);
        return iUnitConverterService.convertThisForMe(unitConverterDTO);
    }
}
