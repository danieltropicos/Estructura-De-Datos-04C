

public class ColasComando {
    Comando cabeza;
    Comando cola;
    Comando cursor;
    public ColasComando() {
        this.cabeza = null;
        this.cola = null;
        this.cursor = null;
    }
    public void AgregarComando(String titulo, boolean exitoso, String directorio) {
        Comando nueva = new Comando(titulo, exitoso, directorio);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            cursor= nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }
    public void siguiente() {
    if (cursor != null) {
        cursor = cursor.siguiente;
        System.out.println(cursor.texto);
    }
    }
    public void anterior() {
        if(cursor !=null){
            cursor=cursor.anterior;
            System.out.println(cursor.texto);
        }
    }
    public void MostrarCursor(){
        if (cursor != null)
        {
            System.out.println(">> " + cabeza.texto + " | " + cabeza.directorio + " | " + (cabeza.exitoso ? "OK" : "ERROR"));
        }
    }
    public void eliminarActual() {
    if (cursor == null) return;

    if (cursor == cursor.siguiente) {
        // solo un nodo
        cabeza = null;
        cola = null;
        cursor = null;
    } else {
        cursor.anterior.siguiente = cursor.siguiente;
        cursor.siguiente.anterior = cursor.anterior;

        if (cursor == cabeza) cabeza = cursor.siguiente;
        if (cursor == cola) cola = cursor.anterior;

        cursor = cursor.siguiente; 
        }
    }
}
