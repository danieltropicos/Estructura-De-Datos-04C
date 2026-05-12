public class PilaPieza {
    private Pieza tope;
    private int tamanio;

    public PilaPieza() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Pieza nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Pieza pop() {
        if (estaVacia()) {
            return null;
        }
        Pieza aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; // Limpiar referencia para seguridad
        return aux;
    }

    public Pieza peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Pieza actual = tope;
        System.out.println("=== PIEZAS (De Tope a Base) ===");
        while (actual != null) {
            if (actual == tope) {
                System.out.print("  TOPE -> ");
            } else {
                System.out.print("          ");
            }
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
        System.out.println("===========================================");
    }

     public void limpiarHastaDefecto() {

        if (tope == null) {
            System.out.println("La pila está vacía");
            return;
        }

        while (tope != null) {

            Pieza piezaActual = pop();

            // Si encontramos la defectuosa
            if (piezaActual.esDefectuosa) {

                System.out.println("PIEZA DEFECTUOSA ENCONTRADA:");
                System.out.println("-> " + piezaActual.nombrePieza);

                // Se detiene inmediatamente
                break;
            }

            // Si era buena
            System.out.println("Pieza buena retirada y descartada:");
            System.out.println("-> " + piezaActual.nombrePieza);
        }
    } 
}
