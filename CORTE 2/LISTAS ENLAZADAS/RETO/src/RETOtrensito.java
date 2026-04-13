import java.util.Scanner;

public class RETOtrensito {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColasTren cola = new ColasTren();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar ID de vagones");
            System.out.println("2. Mostrar Vagones");
            System.out.println("3. Contar Nodos");

            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el ID del tren: ");
                    sc.nextLine();
                    int id = sc.nextInt();
                    Tren t = new Tren(id);
                    cola.agregarAlFinal(t);
                    break;
                case 2:
                    cola.mostrarTrenes();
                    break;
                case 3:
                    cola.ContarNodos();
                    break;
                    
            }
        }while (opc != 0);
    
        sc.close();
    }
}
