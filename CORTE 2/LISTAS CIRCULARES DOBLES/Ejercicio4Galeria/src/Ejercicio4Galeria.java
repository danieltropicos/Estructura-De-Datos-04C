import java.util.Scanner;

public class Ejercicio4Galeria {
    public static void main(String[] args) {

        ColasFoto g = new ColasFoto();
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n===== GALERÍA DE FOTOS =====");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente foto");
            System.out.println("3. Foto anterior");
            System.out.println("4. Marcar / Desmarcar favorita");
            System.out.println("5. Eliminar foto actual");
            System.out.println("6. Mostrar galería");
            System.out.println("7. Fotos por defecto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Título de la foto: ");
                    String titulo = sc.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();

                    g.agregarFoto(new Foto(titulo, fecha));
                    System.out.println("Foto agregada");
                    break;

                case 2:
                    g.siguiente();
                    System.out.println("Avanzando...");
                    break;

                case 3:
                    g.anterior();
                    System.out.println("Retrocediendo...");
                    break;

                case 4:
                    g.toggleFavorita();
                    System.out.println("Estado de favorita cambiado");
                    break;

                case 5:
                    g.eliminarActual();
                    System.out.println("Foto eliminada");
                    break;

                case 6:
                    g.mostrarGaleria();
                    break;
                case 7:

                    g.agregarFoto(new Foto("Playa", "2024-01-10"));
                    g.agregarFoto(new Foto("Montaña", "2024-01-15"));
                    g.agregarFoto(new Foto("Ciudad", "2024-02-01"));
                    g.agregarFoto(new Foto("Familia", "2024-02-10"));
                    g.agregarFoto(new Foto("Amigos", "2024-03-05"));


                case 0:
                    System.out.println("Adiós...");
                    break;

                default:
                    System.out.println("Opción invalida!");
            }

        } while (opc != 0);

        sc.close();
    }
}