public class ColaVagon {
    Vagon cabeza;
    Vagon cola;
    Vagon actual;

    public ColaVagon() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
    }
    public void agregarAlFinal(String id, String tipoCarga) {
        Vagon nuevo = new Vagon(id, tipoCarga);

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
    public ColaVagon dividirTren(String vagonID) {
        if (cabeza == null) return null;

        Vagon actual = cabeza;

        // 1. Buscar el vagón
        while (actual != null && !actual.id.equals(vagonID)) {
            actual = actual.siguiente;
        }

        // 2. Si no existe
        if (actual == null) return null;

        // 3. Crear nueva lista
        ColaVagon nuevaLista = new ColaVagon();

        // Caso: el corte es en la cabeza
        if (actual == cabeza) {
            nuevaLista.cabeza = cabeza;
            nuevaLista.cola = cola;

            // lista original queda vacía
            cabeza = null;
            cola = null;

            return nuevaLista;
        }

        // 4. Separar listas
        Vagon anterior = actual.anterior;

        anterior.siguiente = null;  
        actual.anterior = null;     

        // 5. Ajustar lista original
        cola = anterior;

        // 6. Construir nueva lista
        nuevaLista.cabeza = actual;

        // buscar nueva cola
        Vagon temp = actual;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        nuevaLista.cola = temp;

        return nuevaLista;

    }
    public void mostrarVagones() {
        Vagon actual = cabeza;

        while (actual != null) {
            System.out.println("ID: " + actual.id + " | Tipo: " + actual.tipoCarga);
            actual = actual.siguiente;
        }
        
    }
    

}
