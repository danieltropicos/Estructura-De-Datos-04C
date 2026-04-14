import java.util.Scanner;

public class Ejercicio3Procesos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColasProcesos cola = new ColasProcesos();
        int opc;
        do {
            System.out.println("\n===== Planificador de CPU (Algoritmo Round Robin)=====");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar procesos");
            System.out.println("3. Mostrar procesos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {

                case 1:
                    System.out.print("Nombre del proceso: ");
                    String nombre = sc.nextLine();
                    System.out.print("PID: ");
                    int pid = sc.nextInt();
                    System.out.print("Tiempo restante: ");
                    int tiempo = sc.nextInt();
                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();
                    Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);
                    cola.agregarProceso(nuevo);
                    System.out.println("Proceso agregado correctamente");
                    break;

                case 2:
                    System.out.print("Ingrese el quantum: ");
                    int quantum = sc.nextInt();
                    sc.nextLine();
                    cola.ejecutar(quantum);
                    break;
                case 3:
                    cola.mostrarProcesos();
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