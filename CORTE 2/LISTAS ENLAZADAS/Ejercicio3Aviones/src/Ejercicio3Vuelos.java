import java.util.Scanner;

public class Ejercicio3Vuelos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColasVuelos cola = new ColasVuelos();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Vuelo");
            System.out.println("2. Mostrar Vuelos");
            System.out.println("3. REPORTAR EMERGENCIA");
            System.out.println("0. Salir" );
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero de vuelo: ");
                    sc.nextLine();
                    String numvue = sc.nextLine();
                    System.out.print("Ingrese la aerolinea: ");
                    String aero = sc.nextLine();
                    System.out.print("Ingrese el combustible restante: ");
                    int combus = sc.nextInt();
                    System.out.print("Ingrese el numero de pasajeros: ");
                    int pasajeros = sc.nextInt();

                    Vuelos vuel = new Vuelos(numvue,aero,combus,pasajeros);
                    cola.AgregarVuelos(vuel);
                    
                    break;
                case 2:
                    System.out.println("------ VUELOS -----");
                    cola.mostrarVuelos();
                    break;
                case 3:
                    System.out.println(" --- EMERGENCIA | EMERGENCIA | EMERGENCIA | EMERGENCIA ---");
                    System.out.print("Numero de vuelo en emergencia: ");
                    sc.nextLine();
                    String numEmergencia = sc.nextLine();
                    cola.reportarEmergencia(numEmergencia);
                    break;

                case 0:
                    System.out.println("Adios...");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
