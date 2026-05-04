import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        Editor cola = new Editor();
        do {
            System.out.println("\n===== EDITOR DE CAPAS =====");
            System.out.println("1. Agregar Capa");
            System.out.println("2. Subir Foco");
            System.out.println("3. Bajar Foco");
            System.out.println("4. Mostrar Capas");
            System.out.println("5. Ocultar/Mostrar");
            System.out.println("6. Eliminar Capa Actual");
            System.out.println("7. Capas por defecto");
            System.out.println("8. Foco ACTUAL");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Nombre de la capa: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = sc.nextLine();

                    System.out.print("Visible? true/false: ");
                    boolean visible = sc.nextBoolean();

                    cola.agregarCapa(nombre, visible, tipo);
                    System.out.println("Capa agregada!");
                    break;

                case 2:
                    cola.subirCapa();
                    break;

                case 3:
                    cola.bajarCapa();
                    break;

                case 4:
                    cola.mostrarCapas();
                    break;

                case 5:
                    cola.toggleVisibilidad();
                    break;

                case 6:
                    cola.eliminarActiva();
                    break;

                case 7:
                    // capas por defecto
                    cola.agregarCapa("Fondo", true, "fondo");
                    cola.agregarCapa("Personaje", true, "objeto");
                    cola.agregarCapa("Texto", true, "texto");
                    cola.agregarCapa("Sombras", true, "objeto");

                    break;
                case 8:
                    cola.mostrarCapaActual();
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
