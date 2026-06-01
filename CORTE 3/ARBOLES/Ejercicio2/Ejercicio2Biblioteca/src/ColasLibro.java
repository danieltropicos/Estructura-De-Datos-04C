public class ColasLibro {

    private Libro raiz;

    public ColasLibro() {
        raiz = null;
    }

    // Insertar libro
    public void insertar(Libro libro) {
        raiz = insertarRecursivo(raiz, libro);
    }

    private Libro insertarRecursivo(Libro actual, Libro nuevo) {

        if (actual == null) {
            return nuevo;
        }

        if (nuevo.isbn < actual.isbn) {
            actual.izquierda = insertarRecursivo(actual.izquierda, nuevo);
        } else if (nuevo.isbn > actual.isbn) {
            actual.derecha = insertarRecursivo(actual.derecha, nuevo);
        }

        return actual;
    }

    // Buscar x isbn
    public boolean existeISBN(long isbn) {
        return buscarRecursivo(raiz, isbn);
    }

    private boolean buscarRecursivo(Libro actual, long isbn) {

        if (actual == null) {
            return false;
        }

        if (actual.isbn == isbn) {
            return true;
        }

        if (isbn < actual.isbn) {
            return buscarRecursivo(actual.izquierda, isbn);
        }

        return buscarRecursivo(actual.derecha, isbn);
    }

    public void imprimirCatalogo() {

        if (raiz == null) {
            System.out.println("Catálogo vacío");
            return;
        }

        System.out.println("\n--- CATÁLOGO ORDENADO POR ISBN ---");
        inOrden(raiz);
    }

    private void inOrden(Libro actual) {

        if (actual != null) {

            inOrden(actual.izquierda);

            System.out.println(
                actual.isbn + " - " +
                actual.titulo + " - " +
                actual.autor
            );

            inOrden(actual.derecha);
        }
    }
}