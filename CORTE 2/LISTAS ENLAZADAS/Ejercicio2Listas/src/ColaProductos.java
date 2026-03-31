public class ColaProductos {
    Producto cabeza;

    public ColaProductos() {
        this.cabeza = null;
    }
    public void agregarAlFinal(Producto nuevoProducto) {
        if (cabeza == null) {
        cabeza = nuevoProducto;
        } else {
        Producto actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoProducto;
        }
    }
    public void agregarPrincipio(Producto nuevoProducto) {
        nuevoProducto.siguiente = cabeza; // apunta al anterior primero
        cabeza = nuevoProducto; 
    }
    public void mostrarProductos(){
        Producto actual = cabeza;
        while(actual != null){
            System.out.println("Nombre: " + actual.nombre + " | Cantidad: " + actual.cantidad + " | Dias para que este vencido: " + actual.diasParaVencer + " | ");
            actual = actual.siguiente;
        }
    }
    public void mostrarProductosVencer(){
        Producto actual = cabeza;
        while(actual != null){
            if (actual.diasParaVencer<5){
                System.out.println("Nombre: " + actual.nombre + " | Cantidad: " + actual.cantidad + " | Dias para que este vencido: " + actual.diasParaVencer + " | ");
                actual = actual.siguiente;
            }
                
        }
    }
    

}
