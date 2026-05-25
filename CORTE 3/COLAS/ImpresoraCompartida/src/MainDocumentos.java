import java.util.Scanner;

public class MainDocumentos{

    public static void main(String[] args) throws Exception {

        ColaDocumentos documentos = new ColaDocumentos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        documentos.enqueue(new Documento("PlanoCasa.pdf", "Juan", 10, true));
        documentos.enqueue(new Documento("Contrato.docx", "Maria", 5, false));
        documentos.enqueue(new Documento("Diseño3D.png", "Carlos", 12, true));
        documentos.enqueue(new Documento("Informe.pdf", "Ana", 8, false));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE IMPRESIÓN ---");
            System.out.println("1. Ver cola de impresión");
            System.out.println("2. Agregar documento (Enqueue)");
            System.out.println("3. Imprimir documento (Dequeue)");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nCola de impresión:");
                    documentos.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre del archivo: ");
                    String archivo = scanner.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = scanner.nextBoolean();
                    scanner.nextLine();

                    documentos.enqueue(
                        new Documento(
                            archivo,
                            usuario,
                            paginas,
                            color
                        )
                    );

                    System.out.println("Documento agregado correctamente.");

                    break;

                case 3:

                    Documento impreso = documentos.dequeue();

                    if (impreso != null) {

                        System.out.println("\nDocumento impreso:");
                        System.out.println(
                            impreso.nombreArchivo +
                            " - " +
                            impreso.usuario +
                            " [" + impreso.numeroPaginas + " páginas]"
                        );

                    } else {

                        System.out.println("La cola está vacía.");
                    }

                    break;

                case 4:

                    int total = documentos.calcularPaginasTotales();

                    System.out.println(
                        "Total de páginas pendientes: " + total
                    );

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