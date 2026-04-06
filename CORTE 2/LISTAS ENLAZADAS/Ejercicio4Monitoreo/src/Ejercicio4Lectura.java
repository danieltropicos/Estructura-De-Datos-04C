import java.util.Scanner;

public class Ejercicio4Lectura {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColasLectura cola = new ColasLectura();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Lectura");
            System.out.println("2. Mostrar Lecturas");
            System.out.println("3. Buscar Temperatura mas ALTA");
            System.out.println("0. Salir" );
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el ID del sensor: ");
                    int id = sc.nextInt();
                    System.out.print("Ingrese la temperatura: ");
                    double temp = sc.nextDouble();
                    System.out.print("Ingrese la presion: ");
                    double presion = sc.nextDouble();
                    System.out.print("Ingrese la hora: ");
                    sc.nextLine();
                    String hora = sc.nextLine();

                    Lectura vuel = new Lectura(id,temp,presion,hora);
                    cola.AgregarLectura(vuel);
                    
                    break;
                case 2:
                    System.out.println("------ LECTURAS -----");
                    cola.mostrarLecturas();
                    break;
                case 3:
                    System.out.println("Buscando la temperatura mas alta...");
                    cola.mostrarTemperaturaMaxima();

                case 0:
                    System.out.println("Adios...");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
