package com.tads.ifms.projetoAula.model;

import lombok.Data;

@Data
public class Greeting {
    private float num1;
    private float num2;

    public float Soma(float num1, float num2){
        System.out.println("A soma destes dois números é ");
        return num1+num2;

    }
    
    public float Subtracao(float num1, float num2){
        System.out.println("A subtração destes dois números é ");
        return num1-num2;

    }

    public float Divisao(float num1, float num2){
        System.out.println("A divisão destes dois números é ");
        return num1/num2;

    }

    public float Multiplicao(float num1, float num2){
        System.out.println("A multiplicação destes dois números é ");
        return num1*num2;

    }
    
}