// 3. Impresora Compartida (Red de Oficina)
// En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. 
// Cada vez que alguien envía un documento, este se agrega al final de la cola de impresión. La impresora 
// procesa los trabajos en el orden exacto en que fueron recibidos.

// La Clase Documento (Nodo): Debe contener nombreArchivo (String), usuario (String), numeroPaginas (int) y esColor (boolean).
// El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión pendiente.
// Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos 
// los documentos en espera, sin alterar la cola.
public class Documento {

    String nombreArchivo;
    String usuario;
    int numeroPaginas;
    boolean esColor;

    Documento siguiente;

    public Documento(String nombreArchivo, String usuario, int numeroPaginas, boolean esColor) {

        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.numeroPaginas = numeroPaginas;
        this.esColor = esColor;
        this.siguiente = null;
    }
}