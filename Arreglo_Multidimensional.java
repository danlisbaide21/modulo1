package com.mycompany.arreglo_multidimensional;

public class Arreglo_Multidimensional {
    public static void main(String[] args) {
        
        String[][] compañeros = new String[5][4];

        compañeros[0][0] = "Daniel";
        compañeros[0][1] = "Vega";
        compañeros[0][2] = "Produccion Industrial";
        compañeros[0][3] = "Campo";

        compañeros[1][0] = "Carlos";
        compañeros[1][1] = "Castellanos";
        compañeros[1][2] = "Computacion ";
        compañeros[1][3] = "BanPais";

        compañeros[2][0] = "David";
        compañeros[2][1] = "Munguia";
        compañeros[2][2] = "Inge. Mecatronica";
        compañeros[2][3] = "Sula";

        compañeros[3][0] = "Mirian";
        compañeros[3][1] = "Leiva";
        compañeros[3][2] = "Produccion Industrial";
        compañeros[3][3] = "Cajera";

        compañeros[4][0] = "Juan";
        compañeros[4][1] = "Chavez";
        compañeros[4][2] = "Produccion Industrial";
        compañeros[4][3] = "ENEE";

        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
            System.out.println("--------------------------");
        }
    }
}

