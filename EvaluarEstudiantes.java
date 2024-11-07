package com.mycompany.evaluarestudiantes;
import java.util.Scanner;

public class EvaluarEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nota de " + nombre + ": ");
        int nota = scanner.nextInt();

        String estado = (nota >= 70) ? "Felicidaddes Aprobado" : "Disculpe pero ha Reprobado";

        System.out.println(nombre);
        System.out.println(nota);
        System.out.println(estado);

        scanner.close();
    }
}