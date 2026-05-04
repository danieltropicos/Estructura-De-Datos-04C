public class Comando {
    String texto;
    boolean exitoso;
    String directorio;
    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio){
        this.texto = texto;
        this.exitoso = false;
        this.directorio = directorio;
        this.anterior = null;
        this.siguiente = null;
    }

}
