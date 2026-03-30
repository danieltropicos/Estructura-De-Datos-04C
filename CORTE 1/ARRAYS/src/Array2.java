// 2. Buscador de Cédulas (Base de Datos Bancaria)
// Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

// El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera 
// más rápida posible (en pocos pasos).
// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados,
//  este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cedulas = {
            10010234, 10014567, 10017890, 10020123, 10024567,
            10028901, 10031234, 10035678, 10038901, 10041234,
            10045678, 10048901, 10052345, 10056789, 10060123,
            10064567, 10067890, 10071234, 10075678, 10078901};
        int inicio = 0;
        int fin = cedulas.length - 1;
        int pasos = 0;
        int posicionEncontrada = -1;
        int buscado;
        System.out.println("Ingrese el numero de cliente a buscar");
            buscado = sc.nextInt();
        while (inicio <= fin) {
            pasos++;
            int medio = inicio + (fin - inicio) / 2;

            // ¿Está en el medio?
            if (cedulas[medio] == buscado) {
                posicionEncontrada = medio;
                break;
            }

            // Si el valor del medio es menor, buscamos a la derecha
            if (cedulas[medio] < buscado) {
                inicio = medio + 1;
            }
            // Si el valor del medio es mayor, buscamos a la izquierda
            else {
                fin = medio - 1;
            }
        }
        if (posicionEncontrada != -1) {
            System.out.println("Cedula Encontrada!");
            System.out.println("Posición en el sistema: " + posicionEncontrada);
            System.out.println("Eficiencia: encontrado en " + pasos + " divisiones.");
        } else {
            System.out.println("La cedula " + buscado + " no existe en la biblioteca.");
            System.out.println("Se agotaron los " + pasos + " pasos de búsqueda.");
        }
        sc.close();
    }
}
