package com.bridgelabz.converter.unitconverter.service.implementors;

import com.bridgelabz.converter.unitconverter.baseconverter.BaseConverter;
import com.bridgelabz.converter.unitconverter.baseconverter.DecideConverter;
import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
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
        return Arrays.asList(UnitConverterSubType.values());
    }

    @Override
    public double convertThisForMe(UnitConverterDTO unitConverterDTO) {
        DecideConverter decideConverter=new DecideConverter(unitConverterDTO);
        double conversionValue = decideConverter.getMeValueAfterConversion()*unitConverterDTO.getDesiredConversion();
        return conversionValue;
    }
}
