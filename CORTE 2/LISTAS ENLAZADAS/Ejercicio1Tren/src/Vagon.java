// 1. El Tren de Carga (Logística Ferroviaria)
// Diseña un sistema para gestionar los vagones de un tren de carga internacional.

// La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), origen (String) y destino (String).
// El Problema: El tren sale de una estación y se le van enganchando vagones al final.
// Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada.
public class Vagon {
        public String contenido;
        public double pesoToneladas;
        public String origen;
        public String destino;
        Vagon siguiente;
        public Vagon(String contenido, double pesoToneladas, String origen, String destino){
                this.contenido = contenido;
                this.pesoToneladas = pesoToneladas;
                this.origen = origen;
                this.destino = destino;
                this.siguiente = null;
        }

}
