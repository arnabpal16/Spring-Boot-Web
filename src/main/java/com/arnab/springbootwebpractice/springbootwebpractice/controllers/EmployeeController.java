package com.arnab.springbootwebpractice.springbootwebpractice.controllers;


import com.arnab.springbootwebpractice.springbootwebpractice.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@RestController
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret Message -> Indian Army";
//    }

    @GetMapping(path = "/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new  EmployeeDTO(employeeId, "Arnab", "arnab@gmail.com", 23, LocalDate.of(2025, 8, 6), true);
    }

    @GetMapping(path = "/employees")
    public String getEmployees(@RequestParam Integer age,@RequestParam(required = false)String sortBy){
        return ("Arnab -> "+ age +" "+ sortBy);
    }

}
