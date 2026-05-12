public class PilaEstacion {

    private Estacion tope;
    private int tamanio;

    // PUSH
    public void push(Estacion nueva) {

        nueva.siguiente = tope;

        tope = nueva;
    }
    public int getTamanio() {
        return tamanio;
    }
    public Estacion pop() {

        if (tope == null) {

            return null;
        }

        Estacion aux = tope;

        tope = tope.siguiente;

        aux.siguiente = null;

        return aux;
    }
    public void imprimir() {

        if (tope == null) {

            System.out.println("No hay estaciones registradas.");

            return;
        }

        Estacion aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.siguiente;
        }
    }

    public void retrocederASuperficie() {

        if (tope == null) {

            System.out.println("No hay estaciones para retroceder.");

            return;
        }

        System.out.println("DE VUELTA A LA SUPERFICIE...\n");

        Estacion actual = tope;
        while (tope != null) {

            System.out.println("Retrocediendo por:");
            System.out.println(actual.nombrePunto);
            actual = actual.siguiente;

            // ALERTA
            if (actual.nivelOxigeno < 18) {

                System.out.println("⚠ Uso de Tanque de Emergencia Requerido");
            }

            System.out.println();
        }

        System.out.println("El equipo ha salido de la cueva, esperemos que vivos.");
    }
}