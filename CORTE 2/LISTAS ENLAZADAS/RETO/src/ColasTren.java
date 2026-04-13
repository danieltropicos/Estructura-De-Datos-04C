public class ColasTren {
    Tren cabeza;

    public ColasTren() {
        this.cabeza = null;
    }
    public void mostrarTrenes(){
        Tren actual = cabeza;
        while(actual != null){
            System.out.println("ID: " + actual.id + " | ");
            actual = actual.siguiente;
        }
    }
    public void agregarAlFinal(Tren nuevaCancion) {
        if (cabeza == null) {
        cabeza = nuevaCancion;
        } else {
        Tren actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevaCancion;
        }
    }
    public void ContarNodos(){
        int contador = 0;
        Tren actual = cabeza;
        while(actual != null){
            contador = contador + 1;
            actual = actual.siguiente;
        }
        System.out.println("El sistema cuenta con: " + contador + " nodos.");
    }

}
