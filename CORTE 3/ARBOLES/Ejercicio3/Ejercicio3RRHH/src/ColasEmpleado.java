public class ColasEmpleado {

    private Empleado raiz;

    public ColasEmpleado() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    // Insertar empleado
    public void insertar(Empleado empleado) {
        raiz = insertarRecursivo(raiz, empleado);
    }

    private Empleado insertarRecursivo(Empleado actual, Empleado nuevo) {

        if (actual == null) {
            return nuevo;
        }

        if (nuevo.cedula < actual.cedula) {

            actual.izquierda =
                insertarRecursivo(actual.izquierda, nuevo);

        } else if (nuevo.cedula > actual.cedula) {

            actual.derecha =
                insertarRecursivo(actual.derecha, nuevo);
        }

        return actual;
    }
    public void buscarMinimo() {

        if (isEmpty()) {

            System.out.println("Arbol vacio");
            return;
        }

        Empleado actual = raiz;

        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        System.out.println("--- EMPLEADO CON MENOR CEDULA ---");
        System.out.println("Cedula: " + actual.cedula);
        System.out.println("Nombre: " + actual.nombreCompleto);
        System.out.println("Cargo: " + actual.cargo);
        System.out.println("Salario: $" + actual.salario);
    }
    public void buscarMaximo() {

        if (isEmpty()) {

            System.out.println("Arbol vacio");
            return;
        }

        Empleado actual = raiz;

        while (actual.derecha != null) {
            actual = actual.derecha;
        }

        System.out.println("--- EMPLEADO CON MAYOR CEDULA ---");
        System.out.println("Cedula: " + actual.cedula);
        System.out.println("Nombre: " + actual.nombreCompleto);
        System.out.println("Cargo: " + actual.cargo);
        System.out.println("Salario: $" + actual.salario);
    }
    private int altura(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        int izquierda = altura(nodo.izquierda);
        int derecha = altura(nodo.derecha);

        return Math.max(izquierda, derecha) + 1;
    }
    private int contarHojas(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null &&
            nodo.derecha == null) {

            return 1;
        }

        return contarHojas(nodo.izquierda)
             + contarHojas(nodo.derecha);
    }
    public void reporteEficiencia() {

        System.out.println("--- REPORTE DE EFICIENCIA ---");
        System.out.println("Altura del arbol: "
                + altura(raiz));
        System.out.println("Cantidad de hojas: "
                + contarHojas(raiz));
    }
}