public class Historial {
    Pagina cabeza;

    public Historial() {
        this.cabeza = null;
    }
    
    public void agregarPagina(String urll, String titulo, int visitass) {
        Pagina p = new Pagina(urll, titulo, visitass);
        if (cabeza == null) {
        cabeza = p;
        } else {
        Pagina actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = p;
        }
    }
    public void BuscarID(String idabuscar, int sumar){
        Pagina actual = cabeza;
        while(actual != null){
            if(actual.url.equals(idabuscar)){
                actual.visitas += sumar;
            }
            else{
                System.out.println("No se encontró");
            }
            actual = actual.siguiente;
        }
    }
    public void mostrarPaginas(){
        int total = 0;
        Pagina actual = cabeza;
        System.out.println(" ------- PAGINAS -------");
        while(actual != null){
            System.out.println("URL: " + actual.url + " | Titulo: " + actual.titulo + " | Visitas: " + actual.visitas);
            total += actual.visitas;
            actual = actual.siguiente;
        }
        System.out.println("Total de visitas: " + total);
    }
    public void PaginaTop(){
        int max = 0;
        String tituloguardado = "";
        Pagina actual = cabeza;
        while(actual != null){
            if(actual.visitas>max){
                max = actual.visitas;
                tituloguardado = actual.titulo;  
            }
            actual = actual.siguiente;
        }
        System.out.println("La pagina con mas visitas es: " + tituloguardado + " con: " + max +" visitas.");
    }
}
