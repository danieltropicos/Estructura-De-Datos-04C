// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para
//  un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS
//  métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. 
// El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

import java.util.Scanner;

public class Ordenamiento5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int[] copia = new int[num.length];
        int contadorinsertion = 0;
        int contadorseleccion = 0;
        for (int x = 0; x<6; x++){
            System.out.println("Ingrese el numero: " + (x+1));
            num[x] =sc.nextInt();
        }
        for (int x = 0; x<num.length;x++){
            copia[x]=num[x];
        }
        // 1. Algoritmo de Selección
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del mínimo en el resto del arreglo
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el mínimo encontrado con el primer elemento
            if (indiceMinimo != i) {
                int temp = num[indiceMinimo];
                num[indiceMinimo] = num[i];
                num[i] = temp;
                contadorseleccion++;
            }
        }
        // 2. Algoritmo de Inserción
        int nn = copia.length;
        for (int i = 1; i < nn; i++) {
            int clave = copia[i];
                int j = i - 1;

                while (j >= 0 && copia[j]> clave) {
                    copia[j + 1] = copia[j];
                    j--;
                    contadorinsertion++;
                }

                copia[j + 1] = clave;  

        }
        System.out.println("Algoritmo ordenado por seleccion: ");
        imprimirArreglo(num);
        System.out.println("Swaps hechos: " + contadorseleccion);
        System.out.println("Algoritmo ordenado por Inserción: ");
        imprimirArreglo(copia);
        System.out.println("Swaps hechos: " + contadorinsertion);
        
        sc.close();
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
// El algoritmo más eficiente de los dos fue el de Selección, ya que necesita menos swaps
// para poder ordenar la lista. En cambio, el de Inserción necesita más movimientos de
// elementos dentro del arreglo para ponerlos en su posición correcta.
//
// Aunque también depende de cómo esten los datos. El algoritmo de Selección tiene un
// numero de intercambios más constante, mientras que Inserción depende de qué tan
// desordenados estén los números. Si los datos están casi ordenados, Inserción puede
// llegar a ser mejor que Selección.
//
// En este ejercicio que solo pide 6 números, el más eficiente fue Selección, pero al
// final siempre depende del contexto y de los datos que se quieran ordenar.