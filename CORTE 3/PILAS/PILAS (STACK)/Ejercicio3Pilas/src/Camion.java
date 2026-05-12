// 3. Logística de Distribución (Callejón sin Salida)
// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. 
// Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último
//  camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.

// La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones 
// físicamente (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola)
//  y calcule la suma total de cargaToneladas de todos los camiones estacionados.
public class Camion {

    String placa;
    String conductor;
    double cargaToneladas;

    Camion siguiente;

    public Camion(String placa, String conductor, double cargaToneladas) {
        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;
    }

    @Override
    public String toString() {
        return "[ Placa: " + placa + " | Conductor: " + conductor + " | Carga(T): " + cargaToneladas + " ]";
    }
}
