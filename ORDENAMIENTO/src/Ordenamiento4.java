
// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

import java.util.Scanner;

public class Ordenamiento4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estudiantes;
        System.out.println("Ingrese la cantidad de estudiantes");
        estudiantes = sc.nextInt();
        sc.nextLine();
        String[] estu = new String[estudiantes];
        for (int x = 0; x<estudiantes; x++){
            System.out.println("Ingrese nombre del estudiante: " + (x+1));
            estu[x] =sc.nextLine();
        }
        System.out.print("Original: ");
        imprimirArreglo(estu);

        // 2. Algoritmo de Inserción
        int n = estu.length;
        for (int i = 1; i < n; i++) {
            String clave = estu[i];
                int j = i - 1;

                while (j >= 0 && estu[j].compareToIgnoreCase(clave) > 0) {
                    estu[j + 1] = estu[j];
                    j--;
                }

                estu[j + 1] = clave;  

        }
        


        System.out.println("Lista ordenada alfabeticamente: ");
        imprimirArreglo(estu);
        
        sc.close();

    }
    public static void imprimirArreglo(String[] arr) {
        for (String d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}

