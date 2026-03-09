// 2. Organización de Biblioteca Dinámica
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo debe simular
//  el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando
//  el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver cómo los elementos
//  se desplazan para abrir espacio al nuevo valor.

import java.util.Scanner;
public class Ordenamiento2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int libros;
        System.out.println("Ingrese la cantidad de libros");
        libros = sc.nextInt();
        int[] codigos = new int[libros];
        for (int x = 0; x<libros; x++){
            System.out.println("Ingrese el ISBN del libro: " + (x+1));
            codigos[x] =sc.nextInt();
            // INSERTION SORT solo hasta x
                int clave = codigos[x];
                int j = x - 1;

                while (j >= 0 && codigos[j] > clave) {
                    codigos[j + 1] = codigos[j];
                    j--;
                }

                codigos[j + 1] = clave;

                System.out.print("Paso " + (x + 1) + ": ");
                imprimirArreglo(codigos);

            }
            
        
        sc.close();

    }
    
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
        
    
}
