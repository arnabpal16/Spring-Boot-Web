package com.arnab.springbootwebpractice.springbootwebpractice.controllers;


import com.arnab.springbootwebpractice.springbootwebpractice.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret Message -> Indian Army";
//    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new  EmployeeDTO(employeeId, "Arnab", "arnab@gmail.com", 23, LocalDate.of(2025, 8, 6), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,@RequestParam(required = false)String sortBy){
        return ("Arnab -> "+ age +" "+ sortBy);
    }

    @PostMapping
    public String createNewEmployee(){
        return "Hello Post";
    }

    @PutMapping String updateEmployeeId(){
        return "Hello Put";
    }

}
