import java.util.Scanner;

public class MainPieza {

    public static void main(String[] args) {

        PilaPieza linea = new PilaPieza();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        linea.push(new Pieza("Motor", "SER-001", false));
        linea.push(new Pieza("Tornillo", "SER-002", false));
        linea.push(new Pieza("Engranaje", "SER-003", false));
        linea.push(new Pieza("Piston", "SER-004", true));
        linea.push(new Pieza("Valvula", "SER-005", false));

        int opcion;

        do {

            System.out.println("\n--- CONTROL DE CALIDAD (PILAS) ---");
            System.out.println("1. Ver piezas en la línea");
            System.out.println("2. Registrar nueva pieza (Push)");
            System.out.println("3. Retirar pieza del tope (Pop)");
            System.out.println("4. Limpiar hasta encontrar defecto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nPIEZAS EN LA PILA:");
                    linea.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Número de serie: ");
                    String serie = scanner.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defecto = scanner.nextBoolean();

                    linea.push(new Pieza(nombre, serie, defecto));

                    System.out.println("Pieza agregada correctamente.");

                    break;

                case 3:

                    Pieza retirada = linea.pop();

                    if (retirada != null) {

                        System.out.println("Se retiró:");
                        System.out.println(retirada.nombrePieza);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    System.out.println("\nINICIANDO LIMPIEZA...\n");

                    linea.limpiarHastaDefecto();

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}