public class Pagina {
        public String url;
        public String titulo;
        public int visitas;
        Pagina siguiente;
        public Pagina(String url, String titulo, int visitas){
                this.url = url;
                this.titulo = titulo;
                this.visitas = visitas;
                this.siguiente = null;
        }

}