import java.util.Scanner;

public class MainLibros {

    public static void main(String[] args) {

        ColasLibro catalogo = new ColasLibro();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        catalogo.insertar(new Libro(9781234567890L, "Estructuras de Datos", "Juan Perez", 2020));
        catalogo.insertar(new Libro(9789876543210L, "Bases de Datos", "Maria Gomez", 2019));
        catalogo.insertar(new Libro(9784567891234L, "Programacion Java", "Carlos Ruiz", 2021));
        catalogo.insertar(new Libro(9781111111111L, "Algoritmos", "Ana Torres", 2018));

        int opcion;

        do {

            System.out.println("\n--- CATALOGO DIGITAL (BST) ---");
            System.out.println("1. Ver catálogo ordenado");
            System.out.println("2. Registrar libro");
            System.out.println("3. Buscar ISBN");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    catalogo.imprimirCatalogo();

                    break;

                case 2:

                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    if (catalogo.existeISBN(isbn)) {

                        System.out.println("Ese ISBN ya existe.");

                    } else {

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Año de publicación: ");
                        int ano = scanner.nextInt();

                        catalogo.insertar(
                            new Libro(
                                isbn,
                                titulo,
                                autor,
                                ano
                            )
                        );

                        System.out.println("Libro registrado correctamente.");
                    }

                    break;

                case 3:

                    System.out.print("Ingrese ISBN a buscar: ");
                    long isbnBuscar = scanner.nextLong();

                    if (catalogo.existeISBN(isbnBuscar)) {
                        System.out.println("El ISBN existe.");
                    } else {
                        System.out.println("El ISBN NO existe.");
                    }

                    break;

                case 4:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}