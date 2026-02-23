import java.util.Scanner;

public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fh;
        double kelvin;


        System.out.println("Ingrese la temperatura en CELSIUS (°C)");
        celsius = sc.nextDouble();
        fh = ((celsius*9/5)+32);
        kelvin=celsius + 273.15;

        System.out.println(celsius +" °C " + fh + " °F " + kelvin + " °K ");


    }
 
}
