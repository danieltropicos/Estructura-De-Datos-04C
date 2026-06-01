public class ColasRepuesto {

    private Repuesto raiz;

    public ColasRepuesto() {
        raiz = null;
    }

    // Insertar
    public void insertar(Repuesto repuesto) {
        raiz = insertarRecursivo(raiz, repuesto);
    }

    private Repuesto insertarRecursivo(Repuesto actual, Repuesto nuevo) {

        if (actual == null) {
            return nuevo;
        }

        if (nuevo.codigoRef < actual.codigoRef) {

            actual.izquierda =
                insertarRecursivo(actual.izquierda, nuevo);

        } else if (nuevo.codigoRef > actual.codigoRef) {

            actual.derecha =
                insertarRecursivo(actual.derecha, nuevo);
        }

        return actual;
    }
    public void backupPreOrden() {

        if (raiz == null) {

            System.out.println("Inventario vacio.");
            return;
        }

        System.out.println("\n--- BACKUP PREORDEN ---");
        preOrden(raiz);
    }

    private void preOrden(Repuesto actual) {

        if (actual != null) {

            System.out.println(
                "[" + actual.codigoRef + "] " +
                actual.descripcion + " - " +
                actual.marca +
                " (" + actual.stock + " uds)"
            );

            preOrden(actual.izquierda);
            preOrden(actual.derecha);
        }
    }
    public void mostrarTodos() {

        System.out.println("\n--- INVENTARIO COMPLETO ---");
        mostrarTodosRecursivo(raiz);
    }

    private void mostrarTodosRecursivo(Repuesto actual) {

        if (actual != null) {

            mostrarTodosRecursivo(actual.izquierda);

            System.out.println(
                actual.codigoRef + " - " +
                actual.descripcion + " - " +
                actual.marca + " (" +
                actual.stock + " uds)"
            );

            mostrarTodosRecursivo(actual.derecha);
        }
    }
    private int contarHojas(Repuesto actual) {

        if (actual == null) {
            return 0;
        }

        if (actual.izquierda == null &&
            actual.derecha == null) {

            return 1;
        }

        return contarHojas(actual.izquierda)
             + contarHojas(actual.derecha);
    }
    public void reporteRepuestosUnicos() {

        int hojas = contarHojas(raiz);

        System.out.println(
            "\nCantidad de repuestos sin variantes: "
            + hojas
        );
    }
}