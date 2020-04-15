package com.bridgelabz.converter.unitconverter.service;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;

import java.util.List;

public interface IUnitConverterService {
    public List<UnitConverterEnum> getAllUnits();
    List getMeSubUnits();
}
