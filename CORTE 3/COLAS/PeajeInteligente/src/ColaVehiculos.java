public class ColaVehiculos {

    private Vehiculo salida;
    private Vehiculo entrada;
    private int tamanio;

    public ColaVehiculos() {

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
    public void enqueue(Vehiculo vehiculo) {

        Vehiculo nuevo = vehiculo;

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.siguiente = nuevo;
            entrada = nuevo;
        }

        tamanio++;
    }
    public Vehiculo dequeue() {

        if (isEmpty()) {

            System.out.println("No hay vehículos en la cola");
            return null;
        }

        Vehiculo vehiculo = salida;

        salida = salida.siguiente;

        if (salida == null) {
            entrada = null;
        }

        tamanio--;

        return vehiculo;
    }

    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("Salida > ");

        Vehiculo actual = salida;

        while (actual != null) {

            System.out.print(
                actual.placa +
                " (" + actual.tipoVehiculo + ")" +
                " - $" + actual.tarifa
            );

            if (actual.esExento) {
                System.out.print(" [EXENTO]");
            }

            if (actual.siguiente != null) {
                System.out.print(" > ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public void cerrarTurno() {

        double totalRecaudado = 0;

        while (!isEmpty()) {

            Vehiculo vehiculo = dequeue();

            System.out.println("\nVehículo atendido:");
            System.out.println(
                vehiculo.placa +
                " - " +
                vehiculo.tipoVehiculo
            );

            if (!vehiculo.esExento) {

                totalRecaudado += vehiculo.tarifa;

                System.out.println(
                    "Tarifa cobrada: $" + vehiculo.tarifa
                );

            } else {

                System.out.println("Vehiculo EXENTO!");
            }
        }

        System.out.println(
            "\nTotal recaudado en el turno: $" + totalRecaudado
        );
    }
}