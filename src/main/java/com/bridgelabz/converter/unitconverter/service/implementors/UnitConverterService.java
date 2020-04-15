package com.bridgelabz.converter.unitconverter.service.implementors;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;
import com.bridgelabz.converter.unitconverter.service.IUnitConverterService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UnitConverterService implements IUnitConverterService {
    @Override
    public List<UnitConverterEnum> getAllUnits() {
        return Arrays.asList(UnitConverterEnum.values());
    }

    @Override
    public List getMeSubUnits() {
        List one=  Arrays.asList(UnitConverterSubType.LENGTH.values());
        List two=  Arrays.asList(UnitConverterSubType.VOLUME.values());
        List combinedList = (List) Stream.of(one, two)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        return combinedList;
    }
}
