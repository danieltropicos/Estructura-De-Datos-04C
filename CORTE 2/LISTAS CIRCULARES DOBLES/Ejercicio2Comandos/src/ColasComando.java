

public class ColasComando {
    Comando cabeza;
    Comando cola;
    public ColasComando() {
        this.cabeza = null;
        this.cola = null;
    }
    public void AgregarComando(Comando nuevo){
        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cabeza = nuevo;
        }
    }
    public void Arriba(){
        if(cabeza!=null){
            cabeza=cabeza.anterior;
        }
    }
    public void Abajo(){
        if(cabeza!=null){
            cabeza=cabeza.siguiente;
        }
    }
    public void MostrarCursor(){
        if (cabeza != null)
        {
            System.out.println(">> " + cabeza.texto + " | " + cabeza.directorio + " | " + (cabeza.exitoso ? "OK" : "ERROR"));
        }
    }
     public void eliminarActual()
    {
        if (cabeza == null) return;

        // Si solo hay uno
        if (cabeza.siguiente == cabeza)
        {
            cabeza = null;
            return;
        }

        Comando anterior = cabeza.anterior;
        Comando siguiente = cabeza.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        cabeza = siguiente; // pasa al siguiente automáticamente
    }
}
