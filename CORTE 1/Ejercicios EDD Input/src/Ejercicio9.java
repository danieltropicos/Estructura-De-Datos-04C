// Ejercicio 9 — String inmutable
// Pide al usuario su nombre. Asigna alias = nombre. 
// Pide un nuevo alias. Muestra que nombre no cambió y explica la inmutabilidad de String con un mensaje en consola.

// Datos de entrada: String nombre, String nuevo alias
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String alias;
        System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();
        alias = nombre;
        System.out.println("Alias: "+ alias);
        System.out.println("Ingrese su nuevo alias: ");
            alias = sc.nextLine();
        System.out.println("Nombre: " + nombre);
        System.out.println("Nuevo alias: " + alias);
        sc.close();
    }
}
// No cambia ya que String es inmutable, cuando se crea una copia se crea un nuevo objeto string en memoria totalmente independiente del original.