// 1. El Cajero del Supermercado (Inventario)
// Un cajero escanea un producto con el código de barras 770123. 
// El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

// El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
// Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado=false;
        int buscar = 770123;
        int[] codigosproductos = {458921,770555,123890,999001,770123,340987,111222,888777,654321,777000};

        for (int i = 0; i<codigosproductos.length; i++){
            if (codigosproductos[i]==buscar){
                System.out.println("Se encontró en codigos productos indice: "+ i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
                System.out.println("No se encontró");
            }
        sc.close();
    }
    
}
