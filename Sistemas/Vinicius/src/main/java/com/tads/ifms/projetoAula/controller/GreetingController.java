package com.tads.ifms.projetoAula.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "calculator")
public class GreetingController {

    @GettMapping (value = "/{num1}/{num2}")
    public float Getcalc(@PathVariable float num1, @PathVariable float num2){
        return num1+num2;

    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public float soma(@RequestBody Greeting greeting){
        float result;
        result = (greeting.getNum1() + greeting.getNum2());
        return result;
    }

}