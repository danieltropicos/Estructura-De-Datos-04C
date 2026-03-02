// 4. Control de Acceso (Gimnasio)
// Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad.
//  La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de
//  "pagos al día". Si no está, se le niega la entrada.
// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] codigosGimnasio = {
            1023, 1087, 1154, 1239, 1305,
            1378, 1492, 1586, 1671, 1743,
            1820, 1955, 2034, 2148, 2261,
            2375, 2499, 2583, 2670, 2794,
            2851, 2968, 3057, 3184, 3291,
            3376, 3482, 3599, 3674, 3788,
            3895, 3971, 4086, 4193, 4278,
            4384, 4497, 4582, 4699, 4783,
            4896, 4972, 5087, 5194, 5281,
            5398, 5486, 5593, 5687, 5799
        };
        int buscar;
        System.out.println("Escriba el codigo a buscar");
            buscar = sc.nextInt();
        int inicio = 0;
        int fin = codigosGimnasio.length;
        int encontrado = -1;
        while (inicio<fin) {
            int medio = inicio + (fin-inicio) / 2;
            
            if (codigosGimnasio[medio]==buscar){
                encontrado=codigosGimnasio[medio];
                break;
            }
            if (codigosGimnasio[medio] < buscar){
                inicio = medio +1;
            }
            else {
                fin = medio -1;
            }
        }
        if (encontrado != -1){
            System.out.print("El codigo: " + buscar + " fue encontrado, Bienvenido");
        }
        else {
            System.out.print("El codigo: " + buscar + " NO se encuentra en la seccion de pagos al dia");
        }
        sc.close();
    }
    
}
