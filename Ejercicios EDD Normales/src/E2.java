//Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

//Precio unitario de un producto (double)
//Cantidad comprada (int)
//Descuento aplicado en porcentaje (double)
//Total a pagar después del descuento
//Declara las variables, realiza el cálculo y muestra el resultado por consola.
public class E2 {
    public static void main(String[] args) {
        int precio;
        int cant;
        double descuento;
        int subtotal;
        double total;
        


        
        precio = 5000;
        cant = 5;
        descuento = 10;
        subtotal = precio * cant;
        total = subtotal - (subtotal*descuento/100);


        System.out.println(" ======= RECIBO =======");
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cant);
        System.out.println("Descuento: " + descuento);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("TOTAL A PAGAR: " + total);


    }
}
