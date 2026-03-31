// 3. Torre de Control (Aterrizajes de Emergencia)
// Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

// La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), combustibleRestante (int) y pasajeros (int).
// El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de
//  combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
// Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un vuelo en la cola y lo mueva al principio.
class Vuelos {
    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;
    Vuelos siguiente;

    public Vuelos(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguiente = null;
    }
}