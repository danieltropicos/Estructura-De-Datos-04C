// Ejercicio 6 — Demostración por valor
// Pide al usuario dos números enteros a y b. Asigna b = a,
//  luego pide un nuevo valor para b. Imprime a y b después del cambio
//   y explica con un mensaje en consola por qué a no cambió.

// Datos de entrada: int a, int b (dos veces)

// Salida esperada:

// a = 10  ← no cambió, se pasó por VALOR
// b = 99  ← esta sí cambió
import java.util.Scanner;
public class Ejercicio6 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;


        System.out.println("Ingrese el valor para a");
        a = sc.nextInt();
        b = a;
        System.out.println("Valor A: " + a);
        System.out.println("Valor B: " + b);
        System.out.println("Nuevo valor para B");
        b = sc.nextInt();
        System.out.println("Valor A POST-CAMBIO: " + a);
        System.out.println("Valor B POST-CAMBIO: " + b);
        sc.close();

    }
 
}
    
//No se afecta ya que la data si hace una "copia real" de la variable, copia que es totalmente independiente de la otra
// es decir, son variables completamentes diferentes en memoria.
// cosa que no pasa con los arrays.