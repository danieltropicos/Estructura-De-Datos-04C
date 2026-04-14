// 2. Carrusel de Anuncios (Pantalla Digital)
// Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, vuelve 
// automáticamente al primero.

// La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido (int) y categoria 
// (String - ej: "Oferta", "Marca", "Evento").
// El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más veces se ha repetido.
// Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas por todos los anuncios, incrementando
//  vecesRepetido en cada
//  paso e imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla.
public class Anuncio {
    String titulo;
    int duracionSegundos;
    int vecesRepetido;
    String categoria;
    Anuncio siguiente;

    public Anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.vecesRepetido = 0;
        this.siguiente = null;
    }
}