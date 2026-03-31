public class ColasVuelos {
    Vuelos cabeza;

    public ColasVuelos() {
        this.cabeza = null;
    }
    public void mostrarVuelos(){
        Vuelos actual = cabeza;
        while(actual != null){
            System.out.println("Numero de Vuelo: " + actual.numeroVuelo + " | Aerolinea: " + actual.aerolinea + " | Combustible Restante: " + actual.combustibleRestante + " | Pasajeros: " + actual.pasajeros + " | ");
            actual = actual.siguiente;
        }
    }
    public void AgregarVuelos(Vuelos nuevoVuelo) {
        if (cabeza == null) {
        cabeza = nuevoVuelo;
        } else {
        Vuelos actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoVuelo;
        }
    }
    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) {
            return;
        }
        //es la cabeza?
        if (cabeza.numeroVuelo.equals(numeroVuelo)) {
            System.out.println("La emergencia ya habia sido reportada y estamos trabajando para arreglar todo. (ya esta de primero)");
        }

        Vuelos actual = cabeza;
        Vuelos anterior = null;

        while (actual != null && !actual.numeroVuelo.equalsIgnoreCase(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }
        
        // si no se encuentra
        if (actual == null) {
            System.out.println("El vuelo no existe");
            return;
        }
        // ver si realmente es una emergencia
        if (actual.combustibleRestante >= 10) {
            System.out.println("Este vuelo NO está en emergencia");
            return;
        }
        if (anterior != null) { //posible error
        anterior.siguiente = actual.siguiente; // saco de ahi el vuelo
        }


        // pongo en cabeza
        actual.siguiente = cabeza;
        cabeza = actual;

        System.out.println("VUELO EN ESTADO DE EMERGENCIA EN EL PRIMER PUESTO DE PRIORIDAD");
    }
}
