import java.util.Scanner;

public class MainVehiculos {

    public static void main(String[] args) throws Exception {

        ColaVehiculos vehiculos = new ColaVehiculos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        vehiculos.enqueue(new Vehiculo("ABC123", "Carro", 12000, false));
        vehiculos.enqueue(new Vehiculo("XYZ789", "Moto", 6000, false));
        vehiculos.enqueue(new Vehiculo("GOB001", "Ambulancia", 0, true));
        vehiculos.enqueue(new Vehiculo("JKL456", "Camión", 18000, false));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEAJE ---");
            System.out.println("1. Ver cola de vehículos");
            System.out.println("2. Registrar vehículo (Enqueue)");
            System.out.println("3. Atender vehículo (Dequeue)");
            System.out.println("4. Cerrar turno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nCola actual:");
                    vehiculos.imprimir();

                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Tipo de vehículo: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa = scanner.nextDouble();

                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = scanner.nextBoolean();
                    scanner.nextLine();

                    vehiculos.enqueue(new Vehiculo(placa,tipo,tarifa,exento));

                    System.out.println("Vehículo registrado correctamente.");

                    break;

                case 3:

                    Vehiculo atendido = vehiculos.dequeue();

                    if (atendido != null) {

                        System.out.println("\nVehículo atendido:");
                        System.out.println(
                            atendido.placa +
                            " (" + atendido.tipoVehiculo + ")"
                        );

                    } else {

                        System.out.println("La cola está vacía.");
                    }

                    break;

                case 4:

                    vehiculos.cerrarTurno();

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