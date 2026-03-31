import java.util.Scanner;

public class Ejercicio2ListasEnlazadas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        ColaProductos ProductoUsar = new ColaProductos();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Ver Productos");
            System.out.println("3. Ver productos que se van a vencer");
            System.out.println("0. Salir");
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese los dias para que este vencido: ");
                    int dias = sc.nextInt();
                    Producto p = new Producto(nombre,cantidad,dias);
                    if(dias<3){
                        System.out.println("ADVERTENCIA: EL PRODUCTO VA A VENCER PRONTO...");
                        ProductoUsar.agregarPrincipio(p);
                    }
                    else{
                        ProductoUsar.agregarAlFinal(p);
                    }

                    break;
                case 2:
                    System.out.println("---------------- PRODUCTOS -----------------");
                    ProductoUsar.mostrarProductos();
                    break;
                case 3:
                    System.out.println("------- PRODUCTOS QUE VENCEN PRONTO ---------");
                    ProductoUsar.mostrarProductosVencer();
                    break;
                case 0:
                    System.out.println("Adios...");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
