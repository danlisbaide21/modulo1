//Para poder tener un mejor control del programa se pusieron cometarios de verdadero o falso

package com.mycompany.variables;
public class Variables {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean resultado1 = M > T;                 
        boolean resultado2 = T / K == -5;            
        boolean resultado3 = (M + T == 7) || (M - T == 5);

        System.out.println("M > T: " + resultado1);               // verdadero
        System.out.println("T / K == -5: " + resultado2);         // falso
        System.out.println("(M + T == 7) || (M - T == 5): " + resultado3); // verdadero
    }
}

