import java.util.Scanner;

public class MainRepuestos {

    public static void main(String[] args) {

        ColasRepuesto inventario = new ColasRepuesto();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        inventario.insertar(new Repuesto(500, "Filtro de aceite", "Bosch", 20));
        inventario.insertar(new Repuesto(300, "Pastillas de freno", "Brembo", 15));
        inventario.insertar(new Repuesto(700, "Bateria", "Willard", 10));
        inventario.insertar(new Repuesto(200, "Bujia", "NGK", 50));
        inventario.insertar(new Repuesto(400, "Correa de distribucion", "Gates", 8));

        int opcion;

        do {

            System.out.println("\n--- CONTROL DE INVENTARIO ---");
            System.out.println("1. Ver Backup PreOrden");
            System.out.println("2. Ver Repuestos Unicos");
            System.out.println("3. Registrar Repuesto");
            System.out.println("4. Mostrar Todo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    inventario.backupPreOrden();

                    break;

                case 2:

                    inventario.reporteRepuestosUnicos();

                    break;

                case 3:

                    System.out.print("Codigo de referencia: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Descripcion: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    inventario.insertar(
                        new Repuesto(
                            codigo,
                            descripcion,
                            marca,
                            stock
                        )
                    );

                    System.out.println("Repuesto registrado.");

                    break;

                case 4:

                    inventario.mostrarTodos();

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}