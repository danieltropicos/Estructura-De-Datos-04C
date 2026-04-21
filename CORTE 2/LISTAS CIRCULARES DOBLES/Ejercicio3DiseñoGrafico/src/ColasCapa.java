class ColasCapa {
    Capa cabeza;
    Capa cola;

    public ColasCapa() {
        cabeza = null;
        cola = null;
    }

    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;

            cola = nueva;
        }
    }

    // subir = siguiente
    public void subirCapa() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        }
    }

    // bajar = anterior
    public void bajarCapa() {
        if (cabeza != null) {
            cabeza = cabeza.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (cabeza != null) {
            cabeza.visible = !cabeza.visible;
        }
    }

    public void eliminarActiva() {
        if (cabeza == null) return;

        // solo una
        if (cabeza.siguiente == cabeza) {
            cabeza = null;
            cola = null;
            return;
        }

        Capa anterior = cabeza.anterior;
        Capa siguiente = cabeza.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        // actualizar
        if (cabeza == cola) {
            cola = anterior;
        }

        cabeza = siguiente;
    }

    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        Capa temp = cabeza;

        do {
            String marca = (temp == cabeza) ? "[X]" : "[ ]";
            String vis = temp.visible ? "VISIBLE" : "OCULTA";

            System.out.println(marca + " " + temp.nombre + 
                            " (" + temp.tipo + ") - " + vis);

            temp = temp.siguiente;

        } while (temp != cabeza);
    }
    public void mostrarCapaActual() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        String vis = cabeza.visible ? "VISIBLE" : "OCULTA";

        System.out.println("[ACTUAL] " + cabeza.nombre + 
                        " (" + cabeza.tipo + ") - " + vis);
    }
}