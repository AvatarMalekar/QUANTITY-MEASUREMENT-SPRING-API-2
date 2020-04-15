package com.bridgelabz.converter.unitconverter;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.service.IUnitConverterService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Arrays;
import java.util.List;

@SpringBootTest
class UnitconverterApplicationTests {
    @Autowired
    IUnitConverterService iUnitConverterService;

    @Test
    void givenUnitTypeList_WhenCorrect_ShouldReturnTrue() {
        List<UnitConverterEnum> checkList= Arrays.asList(UnitConverterEnum.values());
        List<UnitConverterEnum> actualList=iUnitConverterService.getAllUnits();
        Assertions.assertEquals(checkList,actualList);
    }
    @Test
    void contextLoads() {
    }

}
