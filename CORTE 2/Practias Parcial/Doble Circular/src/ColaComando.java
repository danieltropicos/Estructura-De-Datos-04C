public class ColaComando {
    Comando cabeza;
    Comando cola;
    Comando actual;

    public ColaComando() {
        cabeza = null;
        cola = null;
        actual = null;
    }
    public void arriba(){
        actual = actual.anterior;
    }
    public void abajo(){
        actual = actual.siguiente;
    }
    public void MostrarCursor(){
        if (actual!=null){
        System.out.println("El cursor actual es: " + actual.texto + " Errores: " + actual.exitoso + " Directorio: " + actual.directorio);
        }
        else {
            System.out.println("ta vacio eso");
        }
    }
    public void EliminarCursor(){
        if (actual == actual.siguiente) {
            // solo un nodo
            cabeza = null;
            cola = null;
            actual = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;

            if (actual == cabeza) cabeza = actual.siguiente;
            if (actual == cola) cola = actual.anterior;

            actual = actual.siguiente; 
        }
    }
    public void AgregarComando(String titulo, boolean exitoso, String directorio) {
        Comando nueva = new Comando(titulo, exitoso, directorio);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            actual= nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }
    public void mostrarCursores() {
        if (cabeza == null) {
            System.out.println("No hay comandos");
            return;
        }
        Comando temp = cabeza;

        System.out.println("\n ----- COMANDOS -----");

        do  {

            if (temp == this.actual) {
                System.out.println("ACTUAL: Texto: " + temp.texto + " - Errores? " + temp.exitoso + " - Directorio: " + temp.directorio);
            } else {
                System.out.println("Texto: " + temp.texto + " - Errores? " + temp.exitoso + " - Directorio: " + temp.directorio);
            }

            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}
