// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). 
// Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro
// indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).
import java.util.Scanner;
public class Ordenamiento1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int corredores;
        System.out.println("Ingrese cuantos corredores participaron");
        corredores = sc.nextInt();
        double[] tiempos = new double[corredores];
        for (int i = 0; i<corredores; i++){
            System.out.println("Ingrese el tiempo en segundos con decimales del corredor " + (i+1));
            tiempos[i] =sc.nextDouble();
        }
        System.out.print("Original: ");
        imprimirArreglo(tiempos);

        // 2. Algoritmo de Selección
        int n = tiempos.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del mínimo en el resto del arreglo
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el mínimo encontrado con el primer elemento
            double temp = tiempos[indiceMinimo];
            tiempos[indiceMinimo] = tiempos[i];
            tiempos[i] = temp;
            sc.close();
        }

        // 3. Resultado final
        System.out.print("Ordenado: ");
        imprimirArreglo(tiempos);

        
        System.out.println("El corredor con el tiempo: " + tiempos[0] + " gana ORO (1er Lugar!)");
        System.out.println("El corredor con el tiempo: " + tiempos[1] + " gana PLATA (2do Lugar!)");
        System.out.println("El corredor con el tiempo: " + tiempos[2] + " gana BRONCE (3er Lugar!)");
    }

    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
