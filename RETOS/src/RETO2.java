import java.util.Scanner;

public class RETO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cuentasVIP = {
            10, 25, 40, 60, 75,
            90, 120, 150, 180, 210,
            250, 300, 350, 400, 450,
            500, 600, 700, 800, 900
        };

        int[] montos = new int[5];
        int[] cuentas = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el monto:");
            montos[i] = sc.nextInt();

            System.out.print("Ingrese número de cuenta: ");
            cuentas[i] = sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {

            if (montos[i] > 5000) {

                int inicio = 0;
                int fin = cuentasVIP.length - 1; 
                int encontrado = -1;
                int buscar = cuentas[i];

                while (inicio <= fin) { 
                    int medio = inicio + (fin - inicio) / 2;

                    if (cuentasVIP[medio] == buscar) {
                        encontrado = medio;
                        break;
                    }

                    if (cuentasVIP[medio] < buscar) {
                        inicio = medio + 1;
                    } else {
                        fin = medio - 1;
                    }
                }

                if (encontrado != -1) {
                    System.out.println("La transacción " + i +" supera 5000 y si está en cuentas VIP en la posicion: " + encontrado);
                }
                 else { 
                    System.out.println("LA TRANSACCION " + i +" ES FRAUDEEE NO SE ENCUENTRA EN VIP");
                    }
                System.out.println("La transacción autorizada");
            }
            else {
                
            }
        }
        sc.close();

    }
}