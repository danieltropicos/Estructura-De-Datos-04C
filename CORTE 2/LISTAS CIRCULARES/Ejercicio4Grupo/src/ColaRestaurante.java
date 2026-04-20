public class ColaRestaurante {

    Grupo cabeza;
    Grupo cola;

    public ColaRestaurante() {
        cabeza = null;
        cola = null;
    }

    public void agregarGrupo(Grupo nuevo) {
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

    public void atenderSiguiente() {

        if (cabeza == null) {
            System.out.println("No hay grupos en espera");
            return;
        }

        Grupo actual = cabeza;

        System.out.println("Atendiendo grupo:");
        System.out.println("Reserva: " + actual.nombreReserva);
        System.out.println("Personas: " + actual.numeroDePersonas);
        System.out.println("VIP: " + actual.esVip);
        System.out.println("Minutos esperando: " + actual.minutosEsperando);

        // unico grupo
        if (cabeza == cola) {

            if (actual.esVip) {
                System.out.println("Grupo VIP vuelve al final (se queda en la lista)");
                // no cambia nada, sigue siendo el unico
            } else {
                cabeza = null;
                cola = null;
                System.out.println("Grupo eliminado");
            }
        }

        //  general
        else {

            // Si es VIP, mover al final
            if (actual.esVip) {
                System.out.println("Grupo VIP pasa al final");

                cabeza = cabeza.siguiente;     // nueva cabeza
                cola = actual;                 // se vuelve cola
                cola.siguiente = cabeza;       // mantiene circular
            }

            // Si NO es VIP, eliminar
            else {
                System.out.println("Grupo atendido y eliminado");

                cabeza = cabeza.siguiente;
                cola.siguiente = cabeza;
            }
        }

        mostrarLista();
    }

    public void mostrarLista() {

        if (cabeza == null) {
            System.out.println("\nLista vacía");
            return;
        }

        Grupo temp = cabeza;

        System.out.println("\n--- Estado de la lista ---");

        do {
            System.out.println("Reserva: " + temp.nombreReserva +
                    " | Personas: " + temp.numeroDePersonas +
                    " | VIP: " + temp.esVip +
                    " | Espera: " + temp.minutosEsperando + " min");

            temp = temp.siguiente;

        } while (temp != cabeza);
    }

    public void simular(int turnos) {
        for (int i = 0; i < turnos; i++) {
            System.out.println("\n===== TURNO " + (i + 1) + " =====");
            atenderSiguiente();
        }
    }
}