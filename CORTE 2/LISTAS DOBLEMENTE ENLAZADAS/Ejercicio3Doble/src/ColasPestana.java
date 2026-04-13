public class ColasPestana {

    Pestana cabeza;
    Pestana cola;
    Pestana actual;

    public ColasPestana() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarPestana(Pestana nueva) {
    if (cabeza == null) {
        cabeza = nueva;
        cola = nueva;
        actual = nueva;
    } else {
        cola.siguiente = nueva;
        nueva.anterior = cola;
        cola = nueva;
        actual = nueva;
    }
}

    public void cerrarPestanaActual(String url) {

    Pestana temp = cabeza;

    while (temp != null) {

        if (temp.url.equals(url)) {

            System.out.println("Cerrando: " + temp.tituloPagina + "...")    ;
            if (cabeza == cola) {
                cabeza = null;
                cola = null;
                actual = null;
            }
            else if (temp == cabeza) {
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
            }
            else if (temp == cola) {
                cola = cola.anterior;
                cola.siguiente = null;
            }
            else {
                temp.anterior.siguiente = temp.siguiente;
                temp.siguiente.anterior = temp.anterior;
            }
            // cambio el foco
            if (actual == temp) {
                if (temp.siguiente != null) {
                    actual = temp.siguiente; 
                } else {
                    actual = temp.anterior;
                }
            }

            return;
        }

        temp = temp.siguiente;
    }

    System.out.println("No se encontró la pestaña con esa URL, quizás la escribiste mal");
}
    public void mostrarPestanaActual() {
            System.out.println("\n--- PESTAÑA ACTUAL ---");
            System.out.println("Título: " + actual.tituloPagina);
            System.out.println("URL: " + actual.url);
            System.out.println("Hora: " + actual.horaApertura);
    }

    public void mostrarPestanas() {
        Pestana actual = cabeza;

        while (actual != null) {
            System.out.println("Título: " + actual.tituloPagina);
            System.out.println("URL: " + actual.url);
            System.out.println("Hora: " + actual.horaApertura);
            actual = actual.siguiente;
        }
    }
}