import java.util.Scanner;

public class Ejercicio3Comandos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        ColasComando cola = new ColasComando();

        

        do {
            System.out.println("\n===== GOOGLE CHROME =====");
            System.out.println("1. Agregar Comando");
            System.out.println("2. Arriba");
            System.out.println("3. Abajo");
            System.out.println("4. Mostrar Cursor");
            System.out.println("5. Eliminar Actual");
            System.out.println("6. Comandos por defecto");
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
                    Comando nueva = new Comando(tx,exi,dir);
                    cola.AgregarComando(nueva);

                    System.out.println("Comando recibido exitosamente!");
                    break;
                case 2:
                    cola.Arriba();
                    break;
                case 3:
                    cola.Abajo();
                    break;
                case 4:
                    cola.MostrarCursor();
                    break;
                case 5:
                    cola.eliminarActual();
                    break;
                case 6:
                    cola.AgregarComando(new Comando("cd /home", true, "/"));
                    cola.AgregarComando(new Comando("ls", true, "/home"));
                    cola.AgregarComando(new Comando("cd documentos", true, "/home"));
                    cola.AgregarComando(new Comando("mkdir proyecto", true, "/home/documentos"));
                    cola.AgregarComando(new Comando("cd proyecto", true, "/home/documentos"));

                    cola.AgregarComando(new Comando("git init", true, "/home/documentos/proyecto"));
                    cola.AgregarComando(new Comando("touch main.cs", true, "/home/documentos/proyecto"));
                    cola.AgregarComando(new Comando("code .", true, "/home/documentos/proyecto"));

                    cola.AgregarComando(new Comando("cd /var/log", true, "/home/documentos/proyecto"));
                    cola.AgregarComando(new Comando("ls", true, "/var/log"));

                    cola.AgregarComando(new Comando("rm error.log", false, "/var/log"));
                    cola.AgregarComando(new Comando("sudo rm error.log", true, "/var/log"));
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