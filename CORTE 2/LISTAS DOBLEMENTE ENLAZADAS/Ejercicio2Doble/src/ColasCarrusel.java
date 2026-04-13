public class ColasCarrusel {
    Carrusel cabeza;
    Carrusel cola;
    Carrusel actual;

    public ColasCarrusel() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
    }
    public void agregarAlFinal(String nombre, double tam, String res) {
        Carrusel nuevo = new Carrusel(nombre, tam, res);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }
    public void agregarDespuesActual(String nombre, double tam, String res) {
        if (actual == null) {
            System.out.println("No hay foto actual");
            return;
        }

        Carrusel nuevo = new Carrusel(nombre, tam, res);

        nuevo.siguiente = actual.siguiente;
        nuevo.anterior = actual;

        if (actual.siguiente != null) {
            actual.siguiente.anterior = nuevo;
        } else {
            cola = nuevo;
        }

        actual.siguiente = nuevo;
    }
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }

        Carrusel aux = cabeza;
        while (aux != null) {
            mostrarFoto(aux);
            aux = aux.siguiente;
        }
    }
    public void mostrarActual() {
        if (actual == null) {
            System.out.println("No hay foto actual");
        } else {
            System.out.println("Foto actual:");
            mostrarFoto(actual);
        }
    }
    public void siguiente() {
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay siguiente");
        } else {
            actual = actual.siguiente;
        }
    }
    public void anterior() {
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay anterior");
        } else {
            actual = actual.anterior;
        }
    }
    public void reproducirGaleria() {
        if (cabeza == null) {
            System.out.println("Agrega fotos primero...");
            return;
        }

        System.out.println("Recorrido hacia adelante:");
        Carrusel actual = cabeza;

        while (actual != null) {
            mostrarFoto(actual);
            actual = actual.siguiente;
        }

        System.out.println("Recorrido hacia atras:");
        actual = cola;

        while (actual != null) {
            mostrarFoto(actual);
            actual = actual.anterior;
        }
    }

    public void mostrarFoto(Carrusel f) {
        System.out.println("Nombre: " + f.nombreArchivo +
                " | Tamaño: " + f.tamanoMB + "MB" +
                " | Resolución: " + f.resolucion);
    }
}