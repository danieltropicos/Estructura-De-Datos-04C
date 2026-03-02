// Ejercicio 8 — Copia real vs referencia
// Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia real en notasRespaldo[] copiando elemento por elemento. Modifica notas[0]
// con un valor que el usuario ingrese. Muestra ambos arreglos y verifica que notasRespaldo no cambió.

// Datos de entrada: double × 3 notas, double nuevo valor para notas[0]

// Salida esperada:

// notas[0]         = 4.5  ← cambió
// notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente

import java.util.Scanner;

public class Ejercicio8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double[] notasrespaldo = new double[notas.length];
        for(int i = 0;i<3;i++){
            System.out.println("Ingrese la nota " + (i+1));
            notas[i] = sc.nextDouble();
        }
        for(int i = 0;i<3;i++){
            notasrespaldo[i]=notas[i];
        }
        System.out.println("Ingrese el nuevo valor para notas 0");
            notas[0] = sc.nextDouble();

        System.out.println(notas[0] + " cambió");
        System.out.println(notasrespaldo[0] +" No cambió");
        sc.close();
    }
}
