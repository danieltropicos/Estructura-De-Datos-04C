public class PilaCamiones {

    private Camion tope;
    private int tamanio;

    public void push(Camion nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }
    public int getTamanio() {
        return tamanio;
    }
    public Camion pop() {

        if (tope == null) {
            return null;
        }

        Camion aux = tope;
        tope = tope.siguiente;
        aux.siguiente = null;

        return aux;
    }
    public void imprimir() {

        if (tope == null) {
            System.out.println("No hay camiones en el callejon.");
            return;
        }

        Camion aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.siguiente;
        }
    }
    public double calcularCargaTotal() {

        double suma = 0;

        Camion actual = tope;

        while (actual != null) {

            suma += actual.cargaToneladas;
            actual = actual.siguiente;
        }
        return suma;
    }
}