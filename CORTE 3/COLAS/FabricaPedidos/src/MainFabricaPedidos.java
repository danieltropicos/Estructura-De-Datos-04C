import java.util.Scanner;

public class MainFabricaPedidos {

    public static void main(String[] args) throws Exception {

        ColaPedidos pedidos = new ColaPedidos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        pedidos.enqueue(new Pedido("P001", "Juan Perez", 150000, false));
        pedidos.enqueue(new Pedido("P002", "Maria Gomez", 85000, true));
        pedidos.enqueue(new Pedido("P003", "Carlos Ruiz", 230000, false));
        pedidos.enqueue(new Pedido("P004", "Ana Torres", 120000, true));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1. Ver cola de pedidos");
            System.out.println("2. Registrar pedido (Enqueue)");
            System.out.println("3. Procesar un pedido (Dequeue)");
            System.out.println("4. Procesar todos los pedidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nCola actual:");
                    pedidos.imprimir();

                    break;

                case 2:

                    System.out.print("Número de pedido: ");
                    String numero = scanner.nextLine();

                    System.out.print("Cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Total a pagar: ");
                    double total = scanner.nextDouble();

                    System.out.print("¿Pedido cancelado? (true/false): ");
                    boolean cancelado = scanner.nextBoolean();
                    scanner.nextLine();

                    pedidos.enqueue(
                        new Pedido(
                            numero,
                            cliente,
                            total,
                            cancelado
                        )
                    );

                    System.out.println("Pedido registrado correctamente.");

                    break;

                case 3:

                    Pedido pedido = pedidos.dequeue();

                    if (pedido != null) {

                        System.out.println("\nPedido procesado:");
                        System.out.println(
                            pedido.numeroPedido +
                            " - " +
                            pedido.cliente
                        );

                    } else {

                        System.out.println("La cola está vacía.");
                    }

                    break;

                case 4:

                    pedidos.procesarPedidos();

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