package com.mycompany.suma_resta_division_multi_mod;

import java.util.Scanner;

public class Suma_Resta_Division_Multi_Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2; 
        int modulo = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        scanner.close();
    }
}
