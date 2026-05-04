import java.util.Scanner;

public class EjercicioVagonesTrenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        ColaVagon cola = new ColaVagon();
        ColaVagon nuevo = null;
        

        

        do {
            System.out.println("\n===== TREN =====");
            System.out.println("1. Guardar Vagon");
            System.out.println("2. Dividir Tren");
            System.out.println("3. Mostrar todas los vagones");
            System.out.println("4. Añadir por defecto");
            System.out.println("5. Ver el nuevo tren (primero hacer el 2)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {

                case 1:
                    System.out.print("ID de el vagón: ");
                    String id = sc.nextLine();

                    System.out.print("Tipo carga: ");
                    String tc = sc.nextLine();

                    cola.agregarAlFinal(id, tc);

                    System.out.println("Pestaña abierta!");
                    break;

                case 2:
                    System.out.print("Ingrese el ID de el vagon a partir en el tren: ");
                    String idabuscar = sc.nextLine();

                    nuevo = cola.dividirTren(idabuscar);

                    break;

                case 3:
                    System.out.println("\n--- TRENSITO ---");
                    cola.mostrarVagones();
                    break;
                case 4:
                    cola.agregarAlFinal("A", "Bulto e Papa");
                    cola.agregarAlFinal("B", "Yuca");
                    cola.agregarAlFinal("C", "Cilantro");
                    cola.agregarAlFinal("D", "Remolacha");
                    cola.agregarAlFinal("E", "Gustavo Cerati");
                    break;
                case 5:
                    if (nuevo != null) {
                        System.out.println("\n--- NUEVO TREN ---");
                        nuevo.mostrarVagones();
                    } else {
                        System.out.println("No hay tren dividido aún");
                    }
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