import java.util.Scanner;

public class Ejercicio1Listas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColaTren cola = new ColaTren();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Vagon");
            System.out.println("2. Calcular peso total");
            System.out.println("3. Mostrar Vagones");
            System.out.println("0. Salir");
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el contenido del vagon: ");
                    sc.nextLine();
                    String contenido = sc.nextLine();
                    System.out.print("Ingrese el peso del vagon (en toneladas): ");
                    double pesoToneladas = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Ingrese el origen del vagon: ");
                    String origen = sc.nextLine();
                    System.out.print("Ingrese el destino del vagon: ");
                    String destino = sc.nextLine();

                    Vagon nuevoVagon = new Vagon(contenido, pesoToneladas, origen, destino);
                    cola.agregarVagon(nuevoVagon);

                    break;
                case 2:
                    System.out.println("CALCULANDO EL PESO TOTAL...");
                    double pesoTotal = cola.calcularPesoTotal();
                    System.out.println("El peso total de los trenes es: " + pesoTotal + "toneladas");
                    break;
                case 3:
                    System.out.println(" --------- VAGONES ---------");
                    cola.mostrarVagones();
                    break;
                case 0:
                    System.out.println("Descarrillando el tren... Adios.");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
