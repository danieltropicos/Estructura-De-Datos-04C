// 5. Torneo de Fútbol (Fixture Round Robin)
// En un torneo de fútbol por todos contra todos, cada equipo debe enfrentarse exactamente una vez contra cada uno de los
//  demás equipos. El algoritmo Round Robin fija los partidos rotando los equipos en un ciclo.

// La Clase Equipo (Nodo): Debe contener nombre (String), ciudad (String), puntos (int) y golesFavor (int).
// El Problema: El fixture se genera rotando la lista: en cada jornada, se enfrentan los equipos opuestos del ciclo 
// (el primero con el último, el segundo con el penúltimo, etc.). Un equipo queda fijo (la cabeza) y el resto rota una posición 
// hacia adelante en cada jornada.
// Reto: Implementa el método generarFixture() que imprima todos los partidos de una jornada completa para 6 equipos
//  (3 partidos por jornada). Luego, rota los equipos una posición y repite hasta que todos se hayan enfrentado. Al final, 
// imprime la tabla de posiciones ordenando los equipos de mayor a menor puntaje (puedes asignar puntos aleatorios o fijos
//  para la simulación).}
public class Equipo {
    String nombre;
    String ciudad;
    int puntos;
    int golesFavor;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = 0;
        this.golesFavor = 0;
    }
}