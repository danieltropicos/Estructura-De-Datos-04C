// Ejercicio 7 — Inventario compartido
// Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.

// Crea el arreglo stockAlmacen con valores iniciales.
// Asigna stockReportes = stockAlmacen.
// Simula una venta reduciendo el stock de un producto desde stockReportes.
// Muestra que stockAlmacen también cambió y explica en comentarios por qué.

public class E7 {
    public static void main(String[] args) {
        int[] stockalmacen = {20,30,40,50,77};
        int[] stockreportes;


        stockreportes=stockalmacen;

        System.out.println("Stock inicial:");
        for (int i = 0; i < stockalmacen.length; i++) {
            System.out.println("Producto " + i + ": " + stockalmacen[i]);
        }
        
        System.out.println("Stock reportes:");
        for (int x = 0; x < stockreportes.length; x++) {
            System.out.println("Producto " + x + ": " + stockreportes[x]);
        }
        

        System.out.println("Venta de 19 cantidades del producto 1! ");

        stockreportes[1] -=19;
        
        System.out.println("Stock post-venta:");
        for (int y = 0; y < stockalmacen.length; y++) {
            System.out.println("Producto " + y + ": " + stockalmacen[y]);
        }
        
        System.out.println("Stock reportes post-venta:");
        for (int z = 0; z < stockreportes.length; z++) {
            System.out.println("Producto " + z + ": " + stockreportes[z]);

        }
        



    }
    
}  

// Los arrays son de tipo referencia, entonces cuando hacemos una "copia" enrealidad son el mismo arreglo, cosa que no pasa con los data