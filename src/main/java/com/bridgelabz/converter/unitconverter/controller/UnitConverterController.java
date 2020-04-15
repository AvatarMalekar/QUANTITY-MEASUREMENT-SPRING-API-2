package com.bridgelabz.converter.unitconverter.controller;

import com.bridgelabz.converter.unitconverter.service.IUnitConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
