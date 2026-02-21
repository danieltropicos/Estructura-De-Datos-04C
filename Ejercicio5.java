//Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.
//Fórmula: IMC = peso / (altura × altura)
import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        double imc;


        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su peso");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);


        System.out.println("Su nombre es " + nombre);
        System.out.println("Su IMC es: " + imc);
        System.out.println("Y su peso es clasificado como: ");

        if (imc<18.5) {
            System.out.println("Bajo Peso");
        }
        else if (imc<25){
            System.out.println("Peso Normal");
        }
        else if (imc<30){
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("OBESIDAD");
        }





    }
 
}
