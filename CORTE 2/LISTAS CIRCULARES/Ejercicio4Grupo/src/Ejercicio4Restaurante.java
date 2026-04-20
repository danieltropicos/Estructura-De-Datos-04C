import java.util.Scanner;

public class Ejercicio4Restaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColaRestaurante restaurante = new ColaRestaurante();

        int opc;

        do {
            System.out.println("\n===== GESTIÓN DE MESAS =====");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Atender siguiente grupo");
            System.out.println("3. Mostrar lista de espera");
            System.out.println("4. Simular 6 turnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Nombre de la reserva: ");
                    String nombre = sc.nextLine();

                    System.out.print("Número de personas: ");
                    int personas = sc.nextInt();

                    System.out.print("¿Es VIP? (true/false): ");
                    boolean vip = sc.nextBoolean();

                    System.out.print("Minutos esperando: ");
                    int minutos = sc.nextInt();
                    sc.nextLine();

                    Grupo nuevo = new Grupo(nombre, personas, vip, minutos);
                    restaurante.agregarGrupo(nuevo);

                    System.out.println("Grupo agregado correctamente");
                    break;

                case 2:
                    restaurante.atenderSiguiente();
                    break;

                case 3:
                    restaurante.mostrarLista();
                    break;

                case 4:
                    restaurante.simular(6);
                    break;

                case 0:
                    System.out.println("Adiós...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opc != 0);

        sc.close();
    }
}