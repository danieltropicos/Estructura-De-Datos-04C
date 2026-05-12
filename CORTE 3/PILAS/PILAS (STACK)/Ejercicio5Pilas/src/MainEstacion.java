import java.util.Scanner;

public class MainEstacion {

    public static void main(String[] args) {

        PilaEstacion cueva = new PilaEstacion();

        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        cueva.push(new Estacion("Entrada Principal", 0, 21));
        cueva.push(new Estacion("Galería Norte", 120, 19));
        cueva.push(new Estacion("Pozo Oscuro", 250, 16));
        cueva.push(new Estacion("Cámara Subterránea", 400, 14));

        int opcion;

        do {

            System.out.println("\n--- RUTA DE RESCATE (PILAS) ---");
            System.out.println("1. Ver estaciones");
            System.out.println("2. Registrar estación (Push)");
            System.out.println("3. Retirar estación del tope (Pop)");
            System.out.println("4. Retroceder a superficie");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nESTACIONES REGISTRADAS:");
                    cueva.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre del punto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Profundidad: ");
                    int profundidad = scanner.nextInt();

                    System.out.print("Nivel de oxígeno: ");
                    double oxigeno = scanner.nextDouble();

                    cueva.push(new Estacion(nombre, profundidad, oxigeno));

                    System.out.println("Estación registrada correctamente.");

                    break;

                case 3:

                    Estacion retirada = cueva.pop();

                    if (retirada != null) {

                        System.out.println("Se retiró:");
                        System.out.println(retirada);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    cueva.retrocederASuperficie();

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