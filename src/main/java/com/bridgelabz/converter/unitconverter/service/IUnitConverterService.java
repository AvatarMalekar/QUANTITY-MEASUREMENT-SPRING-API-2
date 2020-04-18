package com.bridgelabz.converter.unitconverter.service;

import com.bridgelabz.converter.unitconverter.dto.ResponseDTO;
import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;

import java.util.List;

public interface IUnitConverterService {
    List<UnitConverterEnum> getAllUnits();
    List getMeSubUnits();
    ResponseDTO convertThisForMe(UnitConverterDTO unitConverterDTO);
}
