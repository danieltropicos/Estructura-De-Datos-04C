public class ColaJugadores {

    private Jugador raiz;

    public ColaJugadores() {
        raiz = null;
    }
    public void insertar(Jugador jugador) {
        raiz = insertarJugador(raiz, jugador);
    }

    private Jugador insertarJugador(Jugador actual, Jugador nuevo) {

        if (actual == null) {
            return nuevo;
        }

        if (nuevo.elo < actual.elo) {

            actual.izquierda =
                insertarJugador(actual.izquierda, nuevo);

        } else if (nuevo.elo > actual.elo) {

            actual.derecha =
                insertarJugador(actual.derecha, nuevo);
        }

        return actual;
    }
    public void mostrarTodos() {

    if (raiz == null) {
        System.out.println("No hay jugadores registrados.");
        return;
    }

    System.out.println("\n--- LISTA DE JUGADORES ---");
    mostrarTodosRecursivo(raiz);
    }

    private void mostrarTodosRecursivo(Jugador actual) {

        if (actual != null) {

            mostrarTodosRecursivo(actual.izquierda);

            System.out.println(
                actual.elo + " - " +
                actual.nombreUsuario + " - " +
                actual.pais + " - " +
                actual.partidasJugadas + " partidas"
            );

            mostrarTodosRecursivo(actual.derecha);
        }
    }

        // Método solicitado
        public void listarEnRango(int eloMin, int eloMax) {

        System.out.println("\n--- JUGADORES CLASIFICADOS ---");
        listarEnRangoRecursivo(raiz, eloMin, eloMax);
    }

    private void listarEnRangoRecursivo(Jugador actual, int eloMin, int eloMax) {

        if (actual == null) {
            return;
        }
        if (actual.elo > eloMin) {
            listarEnRangoRecursivo(actual.izquierda, eloMin, eloMax);
        }
        if (actual.elo >= eloMin && actual.elo <= eloMax) {

            System.out.println(
                actual.elo + " - " +
                actual.nombreUsuario + " - " +
                actual.pais + " - " +
                actual.partidasJugadas + " partidas"
            );
        }

        // Si puede haber valores válidos a la derecha
        if (actual.elo < eloMax) {
            listarEnRangoRecursivo(actual.derecha, eloMin, eloMax);
        }
    }
}