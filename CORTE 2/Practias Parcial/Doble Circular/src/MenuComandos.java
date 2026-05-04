import java.util.Scanner;

public class MenuComandos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        ColaComando cola = new ColaComando();

        

        do {
            System.out.println("\n===== GOOGLE CHROME =====");
            System.out.println("1. Agregar Comando");
            System.out.println("2. Arriba");
            System.out.println("3. Abajo");
            System.out.println("4. Mostrar Cursor");
            System.out.println("5. Eliminar Actual");
            System.out.println("6. Comandos por defecto");
            System.out.println("7 mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {

                case 1:
                    System.out.print("Texto del comando: ");
                    String tx = sc.nextLine();
                    System.out.print("Ejecuto sin errores? true/false: ");
                    boolean exi = sc.nextBoolean();
                    System.out.print("Directorio path: ");
                    sc.nextLine();
                    String dir = sc.nextLine();
                    cola.AgregarComando(tx, exi, dir);

                    System.out.println("Comando recibido exitosamente!");
                    break;
                case 2:
                    cola.arriba();
                    cola.mostrarCursores();
                    break;
                case 3:
                    cola.abajo();
                    cola.mostrarCursores();
                    break;
                case 4:
                    cola.MostrarCursor();
                    break;
                case 5:
                    cola.EliminarCursor();
                    break;
                case 6:
                    cola.AgregarComando("cd /home", true, "/");
                    cola.AgregarComando("ls", true, "/home");
                    cola.AgregarComando("cd documentos", true, "/home");
                    cola.AgregarComando("mkdir proyecto", true, "/home/documentos");
                    cola.AgregarComando("cd proyecto", true, "/home/documentos");

                    cola.AgregarComando("git init", true, "/home/documentos/proyecto");
                    cola.AgregarComando("touch main.cs", true, "/home/documentos/proyecto");
                    cola.AgregarComando("code .", true, "/home/documentos/proyecto");

                    cola.AgregarComando("cd /var/log", true, "/home/documentos/proyecto");
                    cola.AgregarComando("ls", true, "/var/log");

                    cola.AgregarComando("rm error.log", false, "/var/log");
                    cola.AgregarComando("sudo rm error.log", true, "/var/log");
                    break;
                case 7:
                    cola.mostrarCursores();
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