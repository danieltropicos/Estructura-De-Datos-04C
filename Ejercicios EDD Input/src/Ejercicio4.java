// Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo
//  y si acepta términos y condiciones. Muestra un resumen indicando
//  el tipo de dato que se usó para cada campo.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String correo;
        boolean terminos;

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Ingrese su ciudad");
        ciudad = sc.nextLine();

        System.out.println("Ingrese su correo");
        correo = sc.nextLine();

        System.out.println("¿Acepta terminos y condiciones?");
        terminos = sc.nextBoolean();

        if (terminos==true) {
            System.out.println("Nombre (String): " + nombre);
            System.out.println("Edad (int): " + edad);
            System.out.println("Ciudad (String): " + ciudad);
            System.out.println("Correo (String)  " + correo);

        }
        else {
            System.out.println("No acepto terminos y condiciones");
        }
        sc.close();
        
    }

}