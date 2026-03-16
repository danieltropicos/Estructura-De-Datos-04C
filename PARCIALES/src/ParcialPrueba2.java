// Ejercicio 2: Competencia de Atletismo (Inserción)
// Objetivo: Ingresar puntajes y organizarlos de mayor a menor para determinar el podio.
// ¿Qué debes hacer?
// 1. Entrada: Pide al usuario que ingrese 6 puntajes (números enteros) por teclado.
// 2. Ordenamiento: Usa Inserción (Insertion Sort) para ordenar los puntajes de mayor a menor.
// 3. Búsqueda: Pide un puntaje al usuario y búscalo usando Búsqueda Lineal. Indica en qué posición (lugar) de la
// tabla quedó.

import java.util.Scanner;

public class ParcialPrueba2 {
    public static void main(String[] args) {
        int puntaje;
        int[] puntajes = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INGRESO DE PUNTAJES---");
        for (int i = 0; i<6;i++){
            System.out.println("Ingrese el puntaje " + (i+1));
            puntaje = sc.nextInt();
            puntajes[i]=puntaje;
        }
        int nn = puntajes.length;
        for (int x = 1; x < nn; x++) {
            int clave = puntajes[x];
                int j = x - 1;

                while (j >= 0 && puntajes[j]> clave) {
                    puntajes[j + 1] = puntajes[j];
                    j--;
                }

                puntajes[j + 1] = clave;  

        }
        
        System.out.print("---TABLA DE RESULTADOS: ---" + "\n");
        for(int z = 0; z<puntajes.length;z++){
            System.out.println((z+1) +"Lugar: " + puntajes[z]);
        }
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
