import java.util.Scanner;

public class Ejercicio2Carrusel {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColasCarrusel cola = new ColasCarrusel();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Foto a Continuacion");
            System.out.println("2. Ingresar Foto al Final");
            System.out.println("3. Reproducir Galeria");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Mostrar Foto Actual");
            System.out.println("6. Cambiar Foto Actual");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                System.out.print("Nombre archivo: ");
                    String nombre1 = sc.nextLine();
                    System.out.print("Tamaño MB: ");
                    double tam1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Resolucion: ");
                    String res1 = sc.nextLine();

                    cola.agregarDespuesActual(nombre1, tam1, res1);
                    break;

                case 2:
                    System.out.print("Nombre archivo: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Tamaño MB: ");
                    double tam2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Resolucion: ");
                    String res2 = sc.nextLine();

                    cola.agregarAlFinal(nombre2, tam2, res2);
                    break;

                case 3:
                    cola.reproducirGaleria();
                    break;

                case 4:
                    cola.mostrarLista();
                    break;

                case 5:
                    cola.mostrarActual();
                    break;

                case 6:
                    System.out.println("1. Adelante");
                    System.out.println("2. Atras");
                    int mov = sc.nextInt();

                    if (mov == 1) {
                        cola.siguiente();
                    } else if (mov == 2) {
                        cola.anterior();
                    }
                    break;

                case 0:
                    System.out.println("Adios...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
            
        }while (opc != 0);
    
        sc.close();
    }
}