class ColaCapa {
    Capa cabeza; // fondo
    Capa cola;   // frente

    public ColaCapa() {
        cabeza = null;
        cola = null;
    }

    // Agregar al frente (como en editores: lo nuevo queda arriba)
    public void agregar(String nombre, String color) {
        Capa nueva = new Capa(nombre, color);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    // Mostrar capas (de fondo a frente)
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        Capa temp = cabeza;
        while (temp != null) {
            System.out.println(temp.nombre + " - " + temp.color);
            temp = temp.siguiente;
        }
    }

    // 🔽 ENVIAR AL FONDO
    public void enviarAlFondo(String nombre) {
        if (cabeza == null || cabeza == cola) return;

        Capa actual = cabeza;

        // Buscar
        while (actual != null && !actual.nombre.equals(nombre)) {
            actual = actual.siguiente;
        }

        if (actual == null || actual == cabeza) return;

        // Desconectar
        if (actual == cola) {
            cola = actual.anterior;
            cola.siguiente = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        // Mover a cabeza
        actual.anterior = null;
        actual.siguiente = cabeza;
        cabeza.anterior = actual;
        cabeza = actual;
    }

    // 🔼 TRAER AL FRENTE
    public void traerAlFrente(String nombre) {
        if (cabeza == null || cabeza == cola) return;

        Capa actual = cabeza;

        // Buscar
        while (actual != null && !actual.nombre.equals(nombre)) {
            actual = actual.siguiente;
        }

        if (actual == null || actual == cola) return;

        // Desconectar
        if (actual == cabeza) {
            cabeza = actual.siguiente;
            cabeza.anterior = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        // Mover a cola
        actual.siguiente = null;
        actual.anterior = cola;
        cola.siguiente = actual;
        cola = actual;
    }
}