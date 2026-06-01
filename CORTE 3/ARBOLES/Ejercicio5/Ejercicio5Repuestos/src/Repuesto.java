// 5. Control de Inventario (Almacén de Repuestos)
// Un taller mecánico almacena los repuestos de su inventario en un BST organizado por código de referencia (un número entero único). 
// Cuando un repuesto se agota, su nodo queda como hoja (no tiene hijos) porque no ha sido reemplazado por variantes.
//  El administrador quiere saber cuántos repuestos son "únicos" (sin variantes relacionadas) y cuál es el recorrido 
// completo del inventario en PreOrden para realizar una copia de seguridad del árbol.

// La Clase Repuesto (Nodo): Debe contener codigoRef (int, clave del BST), descripcion (String), marca (String) y stock (int).
// El Problema: El administrador necesita dos reportes: el primero lista todos los repuestos en PreOrden (para poder reconstruir
//  el árbol en otro sistema con el mismo orden de inserción), y el segundo informa cuántos repuestos son hojas del árbol 
// (sin variantes relacionadas).
// Reto: Implementa backupPreOrden() que imprima todos los repuestos en recorrido PreOrden con el formato [codigoRef] descripcion 
// - marca (stock uds). Implementa también reporteRepuestosUnicos() que use contarHojas() e imprima un mensaje indicando cuántos 
// repuestos no tienen variantes relacionadas en el catálogo.

public class Repuesto {

    int codigoRef;
    String descripcion;
    String marca;
    int stock;

    Repuesto izquierda;
    Repuesto derecha;

    public Repuesto(int codigoRef, String descripcion,
                    String marca, int stock) {

        this.codigoRef = codigoRef;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;

        izquierda = null;
        derecha = null;
    }
}