public class ColaPacientes {

    private Paciente salida;
    private Paciente entrada;
    private int tamanio;

    public ColaPacientes() {
        salida = null;
        entrada = null;
        tamanio = 0;
    }
    public boolean isEmpty() {
        return salida == null;
    }
    public int size() {
        return tamanio;
    }

    // Insertar paciente
    public void enqueue(Paciente paciente) {

        Paciente nuevo = paciente;

        if (isEmpty()) {
            salida = nuevo;
            entrada = nuevo;
        } else {
            entrada.siguiente = nuevo;
            entrada = nuevo;
        }

        tamanio++;
    }
    public Paciente dequeue() {

        if (isEmpty()) {
            System.out.println("No hay pacientes en espera");
            return null;
        }

        Paciente paciente = salida;

        salida = salida.siguiente;

        if (salida == null) {
            entrada = null;
        }

        tamanio--;

        return paciente;
    }
    public void atenderTodos() {

        int totalAtendidos = 0;

        while (!isEmpty()) {

            Paciente paciente = dequeue();
            System.out.println(paciente.toString());
            totalAtendidos++;
        }

        System.out.println("Total de pacientes atendidos: " + totalAtendidos);
    }
    public void imprimir() {

        if (isEmpty()) {
            System.out.println("[ Cola vacía ]");
            return;
        }

        Paciente actual = salida;

        System.out.print("Salida > ");

        while (actual != null) {

            System.out.print(
                actual.nombreCompleto +
                " (" + actual.sintomaPrincipal + ")"
            );

            if (actual.siguiente != null) {
                System.out.print(" > ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }
}