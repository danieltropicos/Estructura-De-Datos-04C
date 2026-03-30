// Ejercicio 2 — Conversor de temperatura
// Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

// Fórmulas:

// F = (C × 9/5) + 32
// K = C + 273.15
// Dato de entrada: double temperatura en Celsius

// Salida esperada:

// 25.0 °C = 77.0 °F = 298.15 K
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
        sc.close();

    }
 
}
