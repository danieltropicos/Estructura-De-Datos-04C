public class ColasProcesos {

    Proceso cabeza;
    Proceso cola;

    public ColasProcesos() {
        cabeza = null;
        cola = null;
    }

    public void agregarProceso(Proceso nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }
    }
    public void mostrarProcesos() {
        System.out.println("------------ PROCESOS ------------");
        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso temp = cabeza;

        do {
            System.out.println("Nombre: " + temp.nombre);
            System.out.println("PID: " + temp.pid);
            System.out.println("Tiempo restante: " + temp.tiempoRestante);
            System.out.println("Prioridad: " + temp.prioridad);
            System.out.println("---------------------------");

            temp = temp.siguiente;

        } while (temp != cabeza);
    }
        public void ejecutar(int quantum) {

        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso actual = cabeza;
        String ordenFinalizacion = "";

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre +" (PID: " + actual.pid + ")" +  " | Tiempo restante: " + actual.tiempoRestante);

            // Ejecuto el quantum
            actual.tiempoRestante -= quantum;

            // Si termina:
            if (actual.tiempoRestante <= 0) {

                System.out.println("Proceso terminado: " + actual.nombre);

                ordenFinalizacion += actual.nombre + " -> ";
                // solo 1 nodo
                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                    actual = null;
                }
                // eliminar cabeza
                else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                }
                // eliminar cola
                else if (actual == cola) {
                    Proceso temp = cabeza;
                    while (temp.siguiente != cola) {
                        temp = temp.siguiente;
                    }
                    cola = temp;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                }
                // eliminar en medio
                else {
                    Proceso temp = cabeza;
                    while (temp.siguiente != actual) {
                        temp = temp.siguiente;
                    }
                    temp.siguiente = actual.siguiente;
                    actual = actual.siguiente;
                }

            } else {
                //si no termina, pasa al siguiente
                System.out.println("Le queda: " + actual.tiempoRestante);
                actual = actual.siguiente;
            }
        }
        System.out.println("\n===== ORDEN DE FINALIZACIÓN =====");
        System.out.println(ordenFinalizacion);
    }
}