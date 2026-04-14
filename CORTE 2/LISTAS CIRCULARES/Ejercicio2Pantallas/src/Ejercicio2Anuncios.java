import java.util.Scanner;

public class Ejercicio2Anuncios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColasAnuncios cola = new ColasAnuncios();
        int opc;
        do {
            System.out.println("===== CARRUSEL DE ANUNCIOS =====");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Reproducir anuncios");
            System.out.println("3. Mostrar anuncios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    System.out.print("Titulo del anuncio: ");
                    String titulo = sc.nextLine();
                    System.out.print("Duracion (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Categoria (Oferta, Marca, Evento...): ");
                    String categoria = sc.nextLine();
                    Anuncio nuevo = new Anuncio(titulo, duracion, categoria);
                    cola.agregarAnuncio(nuevo);
                    System.out.println("Anuncio agregado correctamente");
                    break;
                case 2:
                    System.out.print("Ingrese cantidad de ciclos: ");
                    int ciclos = sc.nextInt();
                    sc.nextLine();
                    cola.reproducir(ciclos);
                    break;
                case 3:
                    cola.mostrarAnuncios();
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