import java.util.Scanner;

public class Ejercicio5Canciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColasCancion cola = new ColasCancion();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Cancion a Continuacion");
            System.out.println("2. Ingresar Cancion al Final");
            System.out.println("3. Mostrar Duracion de las canciones");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Mostrar Cancion Actual");
            System.out.println("6. Cambiar Cancion Actual");
            System.out.println("0. Salir" );
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el titulo de la cancion: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Ingrese la duracion en segundos: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el genero: ");
                    String genero = sc.nextLine();
                    Cancion cancion = new Cancion(titulo, artista, duracion, genero);
                    cola.AgregaraContinuacion(cancion);
                    break;
                case 2:
                    System.out.print("Ingrese el titulo de la cancion: ");
                    sc.nextLine();
                    String titulof = sc.nextLine();
                    System.out.print("Ingrese el artista: ");
                    String artistaf = sc.nextLine();
                    System.out.print("Ingrese la duracion en segundos: ");
                    int duracionf = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Ingrese el genero: ");
                    String generof = sc.nextLine();
                    Cancion cancionf = new Cancion(titulof, artistaf, duracionf, generof);
                    cola.agregarAlFinal(cancionf);
                    break;
                case 3:
                    System.out.println("Calculando duracion total de canciones...");
                    cola.mostrarDuracionTotal();
                    break;
                case 4:
                    System.out.println("Buscando Lista...");
                    cola.mostrarCanciones();
                    break;
                case 5:
                    cola.mostrarCancionActual();
                    break;
                case 6:
                    cola.cambiarCancionActual();
                    break;
                case 0:
                    System.out.println("Adios...");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
