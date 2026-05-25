public class ColaDocumentos {

    private Documento salida;
    private Documento entrada;
    private int tamanio;

    public ColaDocumentos() {

        salida = null;
        entrada = null;
        tamanio = 0;
    }
    public boolean isEmpty() {
        return salida == null;
    }
    public int size() {
        return tamanio;
    }
    public void enqueue(Documento documento) {

        Documento nuevo = documento;

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.siguiente = nuevo;
            entrada = nuevo;
        }

        tamanio++;
    }
    public Documento dequeue() {

        if (isEmpty()) {

            System.out.println("No hay documentos en cola");
            return null;
        }

        Documento documento = salida;

        salida = salida.siguiente;

        if (salida == null) {
            entrada = null;
        }

        tamanio--;

        return documento;
    }
    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("Salida > ");

        Documento actual = salida;

        while (actual != null) {

            System.out.print(
                actual.nombreArchivo +
                " > " +
                actual.usuario +
                " [" + actual.numeroPaginas + " páginas]"
            );

            if (actual.esColor) {
                System.out.print(" (Color)");
            } else {
                System.out.print(" (Blanco y negro)");
            }

            if (actual.siguiente != null) {
                System.out.print(" > ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    // Calcular páginas totales
    public int calcularPaginasTotales() {

        int total = 0;

        Documento actual = salida;

        while (actual != null) {

            total += actual.numeroPaginas;

            actual = actual.siguiente;
        }

        return total;
    }
}