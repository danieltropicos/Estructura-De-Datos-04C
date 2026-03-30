//Pide al usuario su nombre y 4 notas de un curso.
// Calcula el promedio y determina si aprobó (promedio >= 3.0).
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double promedio;


        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.println("Ingrese la nota");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese la nota");
        nota2 = sc.nextDouble();

        System.out.println("Ingrese la nota");
        nota3 = sc.nextDouble();

        System.out.println("Ingrese la nota");
        nota4 = sc.nextDouble();
        
        promedio=(nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (promedio>=3.0) {
            System.out.println("Estado APROBADO");
        }
        else {
            System.out.println("Estado REPROBADO");
        }


        sc.close();

    }
    
}
