// 3. El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

// Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma 
//  eficiente que el método de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
// N
// /
// 2
// . El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción 
// simple al trabajar con elementos que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar
//  todas las fases de reducción de saltos.

import java.util.Scanner;

public class Ordenamiento3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el N de paquetes");
        numero = sc.nextInt();
        double[] pesos = new double[numero];
        for (int i = 0; i<numero; i++){
            System.out.println("Ingrese el peso del paquete " + (i+1) + ":");
            pesos[i] =sc.nextDouble();
        }
        System.out.print("Original: ");
        imprimirArreglo(pesos);

        // 2. Algoritmo Shell
        int n = pesos.length;

        // Empezar con un gap grande y reducirlo a la mitad en cada paso
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Hacer un ordenamiento por inserción para este gap
            for (int i = gap; i < n; i++) {
                double temp = pesos[i];
                int j;
                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {
                    pesos[j] = pesos[j - gap];
                }
                pesos[j] = temp;
            }
            
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(pesos);
        sc.close();
    }
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }

}
// Por lo general, Shell Sort es mas rapido que Insertion Sort por la forma en la que mueve 
// los elementos cada algoritmo. Mientras que Insertion Sort ordena comparando elementos consecutivos
// y los mueve de 1 en 1 Shell Sort mejora esto usando saltos (gaps), en vez de comparar solo vecinos, compara elementos que
// están lejos.