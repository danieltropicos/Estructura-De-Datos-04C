public class PilaMedicamento {

    private Medicamento tope;
    private int tamanio;

    // PUSH
    public void push(Medicamento nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio ++;
    }
    public int getTamanio() {
        return tamanio;
    }

    // POP
    public Medicamento pop() {

        if (tope == null) {
            return null;
        }

        Medicamento aux = tope;

        tope = tope.siguiente;

        aux.siguiente = null;

        return aux;
    }

    // IMPRIMIR
    public void imprimir() {

        if (tope == null) {

            System.out.println("No hay medicamentos.");
            return;
        }

        Medicamento aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.siguiente;
        }
    }

    // RETO
    public void validarDespacho() {

        while (tope != null && tope.diasParaVencer < 10) {

            Medicamento vencido = pop();

            System.out.println("Medicamento retirado automáticamente:");
            System.out.println(vencido);
        }

        if (tope != null) {

            System.out.println("\nMedicamento seguro para despacho:");
            System.out.println(tope);

        } else {

            System.out.println("\nNo quedan medicamentos seguros.");
        }
    }
}