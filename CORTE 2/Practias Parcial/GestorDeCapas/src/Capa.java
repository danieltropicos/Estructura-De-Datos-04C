class CapaParcial {
    String nombre;
    boolean visible;
    String tipo;

    CapaParcial siguiente;
    CapaParcial anterior;

    public CapaParcial(String nombre, boolean visible, String tipo) {
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
