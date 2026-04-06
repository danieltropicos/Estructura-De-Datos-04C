// 4. Monitoreo Industrial (Sensores en Tiempo Real)
// Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.
class Lectura {
    int idSensor;
    double temperatura;
    double presion;
    String hora;
    Lectura siguiente;


    public Lectura(int idSensor, double temperatura, double presion, String hora) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
        this.presion = presion;
        this.hora = hora;
        this.siguiente = null;
    }
}