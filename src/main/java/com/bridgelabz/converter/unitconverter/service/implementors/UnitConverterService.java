package com.bridgelabz.converter.unitconverter.service.implementors;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.service.IUnitConverterService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UnitConverterService implements IUnitConverterService {
    @Override
    public List<UnitConverterEnum> getAllUnits() {
        return Arrays.asList(UnitConverterEnum.values());

    }
}
