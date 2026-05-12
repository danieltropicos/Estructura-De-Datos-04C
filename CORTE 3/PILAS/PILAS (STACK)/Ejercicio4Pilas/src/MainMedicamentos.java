import java.util.Scanner;

public class MainMedicamentos {

    public static void main(String[] args) {

        PilaMedicamento farmacia = new PilaMedicamento();

        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        farmacia.push(new Medicamento("Ibuprofeno", "LOT-001", 30));
        farmacia.push(new Medicamento("Paracetamol", "LOT-002", 5));
        farmacia.push(new Medicamento("Amoxicilina", "LOT-003", 3));
        farmacia.push(new Medicamento("Vitamina C", "LOT-004", 20));

        int opcion;

        do {

            System.out.println("\n--- FARMACIA AUTOMATIZADA (PILAS) ---");
            System.out.println("1. Ver medicamentos");
            System.out.println("2. Registrar medicamento (Push)");
            System.out.println("3. Retirar medicamento del tope (Pop)");
            System.out.println("4. Validar despacho");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nMEDICAMENTOS EN EL TUBO:");
                    farmacia.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = scanner.nextInt();

                    farmacia.push(new Medicamento(nombre, lote, dias));

                    System.out.println("Medicamento agregado correctamente.");

                    break;

                case 3:

                    Medicamento retirado = farmacia.pop();

                    if (retirado != null) {

                        System.out.println("Se retiró:");
                        System.out.println(retirado);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    System.out.println("\nVALIDANDO DESPACHO...\n");

                    farmacia.validarDespacho();

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