package com.mycompany.exemplotriangulo;

public class Triangulo {

    public double hipotenusa(double base, double altura) {

        double resultado;

        resultado = Math.sqrt((base * base) + (altura * altura));

        return resultado;

    }

}