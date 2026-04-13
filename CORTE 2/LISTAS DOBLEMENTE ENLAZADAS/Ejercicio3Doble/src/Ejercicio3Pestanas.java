import java.util.Scanner;

public class Ejercicio3Pestanas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        ColasPestana cola = new ColasPestana();

        

        do {
            System.out.println("\n===== GOOGLE CHROME =====");
            System.out.println("1. Abrir nueva pestaña");
            System.out.println("2. Cerrar pestaña por URL");
            System.out.println("3. Mostrar todas las pestañas");
            System.out.println("4. Mostrar pestaña actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {

                case 1:
                    System.out.print("Titulo de la página: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora apertura: ");
                    String hora = sc.nextLine();

                    Pestana nueva = new Pestana(titulo, url, hora);
                    cola.agregarPestana(nueva);

                    System.out.println("Pestaña abierta!");
                    break;

                case 2:
                    System.out.print("Ingrese la URL de la pestaña a cerrar: ");
                    String urlCerrar = sc.nextLine();

                    cola.cerrarPestanaActual(urlCerrar);
                    break;

                case 3:
                    System.out.println("\n--- Pestañas abiertas ---");
                    cola.mostrarPestanas();
                    break;
                case 4:
                    cola.mostrarPestanaActual();
                    break;
                case 0:
                    System.out.println("Adios...");
                    break;

                default:
                    System.out.println("Opción invalida");
            }

        } while (opc != 0);

        sc.close();
    }
}