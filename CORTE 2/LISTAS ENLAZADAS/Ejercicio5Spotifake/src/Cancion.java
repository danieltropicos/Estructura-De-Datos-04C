// 5. Spotify Lite (Lista de Reproducción)
// Crea un reproductor de música simplificado que gestione una lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS.
public class Cancion {
    String titulo;
    String artista;
    int duracionSegundos;
    String genero;
    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracionSegundos, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.siguiente = null;
    }
}