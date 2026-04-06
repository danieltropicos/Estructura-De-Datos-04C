public class ColasCancion {
    Cancion cabeza;

    public ColasCancion() {
        this.cabeza = null;
    }
    public void mostrarCanciones(){
        Cancion actual = cabeza;
        while(actual != null){
            System.out.println("Titulo: " + actual.titulo + " | Artista: " + actual.artista + " | Duracion: " + actual.duracionSegundos + " | Genero: " + actual.genero + " | ");
            actual = actual.siguiente;
        }
    }
    public void agregarAlFinal(Cancion nuevaCancion) {
        if (cabeza == null) {
        cabeza = nuevaCancion;
        } else {
        Cancion actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevaCancion;
        }
    }
    public void AgregaraContinuacion(Cancion nuevaCancion) {
        nuevaCancion.siguiente = cabeza; 
        cabeza = nuevaCancion; 
    }
    public void mostrarDuracionTotal() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        int totalSegundos = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            totalSegundos += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        String tiempoFormateado = String.format("%02d:%02d", minutos, segundos);

        System.out.println("Duración total: " + tiempoFormateado);
        }
    public void mostrarCancionActual() {
        if (cabeza == null) {
            System.out.println("No hay canción en reproducción");
            return;
        }

        System.out.println("Canción actual:");
        System.out.println("Titulo: " + cabeza.titulo);
        System.out.println("Artista: " + cabeza.artista);
        System.out.println("Duración: " + cabeza.duracionSegundos + " segundos");
        System.out.println("Género: " + cabeza.genero);
    }
    public void cambiarCancionActual() {
        if (cabeza == null) {
            System.out.println("No hay canciones en la lista");
            return;
        }

        if (cabeza.siguiente == null) {
            System.out.println("Ya estás en la última canción");
            return;
        }

        cabeza = cabeza.siguiente;

        System.out.println("Esta Sonando: " + cabeza.titulo);
}

}
