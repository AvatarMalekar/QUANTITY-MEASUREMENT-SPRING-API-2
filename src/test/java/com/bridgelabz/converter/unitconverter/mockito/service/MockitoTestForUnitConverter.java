package com.bridgelabz.converter.unitconverter.mockito.service;

import com.bridgelabz.converter.unitconverter.dto.UnitConverterDTO;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType;
import com.bridgelabz.converter.unitconverter.service.implementors.UnitConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum.LENGTH;
import static com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType.FEET;
import static com.bridgelabz.converter.unitconverter.enumration.UnitConverterSubType.INCH;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class MockitoTestForUnitConverter {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private UnitConverterService unitConverterService;

    @Test
    void givenUnits_WhenGetUnits_ShouldReturn_JsonArray() {
        UnitConverterEnum[] expectedArray = {LENGTH, UnitConverterEnum.VOLUME};
        given(unitConverterService.getAllUnits()).willReturn(Arrays.asList(expectedArray));
        try {
            this.mvc.perform(get("unit/type"))
                    .andDo(print()).andExpect(status().isOk()).andExpect(content().json(Arrays.toString(expectedArray)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenSubUnits_WhenGetUnits_ShouldReturn_JsonArray() {
        Enum expectedArray[] = {FEET, INCH, UnitConverterSubType.YARD,
                UnitConverterSubType.GALLON, UnitConverterSubType.LITRES, UnitConverterSubType.MILILETRES};
        given(unitConverterService.getMeSubUnits()).willReturn(Arrays.asList(expectedArray));
        try {
            this.mvc.perform(get("unit/subtype"))
                    .andDo(print()).andExpect(status().isOk()).andExpect(content().json(Arrays.toString(expectedArray)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenConverter_WhenGetUnits_SubUnits_And_Value_ShouldReturn_Value() {
        double expectedValue=48;
        UnitConverterDTO unitConverterDTO=new UnitConverterDTO();
        unitConverterDTO.setMainType(LENGTH);
        unitConverterDTO.setInitialUnit(FEET);
        unitConverterDTO.setDesiredConversion(INCH);
        unitConverterDTO.setValue(4);
        given(unitConverterService.convertThisForMe(unitConverterDTO)).willReturn(expectedValue);
        try {
            this.mvc.perform(get("unit/convert"))
                    .andDo(print()).andExpect(status().isOk()).andExpect(content().json(String.valueOf(expectedValue)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
