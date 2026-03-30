// Ejercicio 1 Input - Pide al usuario el nombre de un producto,
//  la cantidad comprada y el precio unitario.
//  Calcula el subtotal, aplica un IVA del 19% 
// y muestra el recibo con el total a pagar.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String producto;
        int cantidad;
        double precio;
        double subtotal;
        double iva;
        double total;

        System.out.println("Ingrese el nombre del producto");
        producto = sc.nextLine();

        System.out.println("Ingrese la cantidad del producto");
        cantidad = sc.nextInt();

        System.out.println("Ingrese el precio del producto");
        precio = sc.nextDouble();

        subtotal = cantidad*precio;
        iva = subtotal *0.19;
        total = subtotal + iva;

        System.out.println("==== RECIBO ====");
        System.out.println("Producto :" + producto);
        System.out.println("Cantidad :" + cantidad);
        System.out.println("Precio c/u :" + precio);
        System.out.println("Subtotal :" + subtotal);
        System.out.println("IVA (19%) :" + iva);
        System.out.println("Total :" + total);
        sc.close();
    }

    
}