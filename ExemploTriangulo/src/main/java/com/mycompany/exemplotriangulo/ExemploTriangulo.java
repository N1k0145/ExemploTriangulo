package com.mycompany.exemplotriangulo;

import java.util.Scanner;

public class ExemploTriangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double base;
        double altura;
        double resultado;

        System.out.print("Digite a base: ");
        base = teclado.nextDouble();

        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();

        Triangulo t1 = new Triangulo();

        resultado = t1.hipotenusa(base, altura);

        System.out.printf("A hipotenusa e: %.2f%n", resultado);

    }

}