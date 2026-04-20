import java.util.Scanner;

public class Ejercicio5Torneo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fixture torneo = new Fixture();

        int opc;

        do {
            System.out.println("\n===== TORNEO FUBOL =====");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Generar fixture");
            System.out.println("3. Mostrar tabla");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Nombre del equipo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();
                    Equipo nuevo = new Equipo(nombre, ciudad);
                    torneo.agregarEquipo(nuevo);
                    System.out.println("Equipo agregado correctamente");
                    break;

                case 2:
                    torneo.generarFixture();
                    break;

                case 3:
                    torneo.mostrarTabla();
                    break;

                case 0:
                    System.out.println("Adiós...");
                    break;

                default:
                    System.out.println("Opción invalida");
            }

        } while (opc != 0);

        sc.close();
    }
}