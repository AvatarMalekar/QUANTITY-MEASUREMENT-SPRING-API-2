package com.bridgelabz.converter.unitconverter.mockito.service;

import com.bridgelabz.converter.unitconverter.enumration.UnitConverterEnum;
import com.bridgelabz.converter.unitconverter.service.implementors.UnitConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

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
    public void name() {
        UnitConverterEnum[] expectedArray = {UnitConverterEnum.LENGTH, UnitConverterEnum.VOLUME};
        System.out.println(expectedArray);
        given(unitConverterService.getAllUnits()).willReturn(Arrays.asList(expectedArray));
        try {
            this.mvc.perform(get("unit/type"))
                    .andDo(print()).andExpect(status().isOk()).andExpect(content().json(Arrays.toString(expectedArray)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
