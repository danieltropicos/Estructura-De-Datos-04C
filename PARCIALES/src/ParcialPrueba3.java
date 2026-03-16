import java.util.Scanner;

public class ParcialPrueba3 {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- REGISTRO DE NOTAS ---");
        for (int i = 0; i<5;i++){
            System.out.println("Ingrese nota del estudiate " + (i+1));
            nota = sc.nextDouble();
            notas[i]=nota;
        }
        int n = notas.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del mínimo en el resto del arreglo
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (notas[j] < notas[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el mínimo encontrado con el primer elemento
            double temp = notas[indiceMinimo];
            notas[indiceMinimo] = notas[i];
            notas[i] = temp;
            sc.close();
        }
        System.out.println("--- INFORME ACADEMICO ---");
        System.out.println("La nota mas ALTA del grupo es: " + notas[(notas.length-1)]);
        System.out.println("La nota mas BAJA del grupo es: " + notas[0]);

        System.out.println("Arreglo ordenado");
        imprimirArreglo(notas);
    }   
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
