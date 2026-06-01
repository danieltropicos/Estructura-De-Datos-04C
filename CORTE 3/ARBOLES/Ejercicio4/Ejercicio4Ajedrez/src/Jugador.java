// 4. Torneo de Ajedrez (Sistema de Rankings ELO)
// Una plataforma de ajedrez en línea gestiona el ranking ELO de sus jugadores en un BST. 
// A medida que los jugadores completan partidas, su ELO se actualiza y se reinsertan en el árbol.
//  El director del torneo necesita obtener la lista de jugadores que clasifican a la siguiente ronda, 
// es decir, todos aquellos cuyo ELO se encuentre dentro de un rango específico.

// La Clase Jugador (Nodo): Debe contener elo (int, clave del BST), nombreUsuario (String), pais (String) y partidasJugadas (int).
// El Problema: Para la ronda de clasificación, el director fija un rango mínimo y máximo de ELO (por ejemplo, entre 1800 y 2200).
//  Todos los jugadores en ese rango deben ser listados de menor a mayor ELO para armar los emparejamientos.
// Reto: Implementa el método listarEnRango(int eloMin, int eloMax) que recorra el árbol e imprima los datos de todos los 
// jugadores cuyo elo esté dentro del rango [eloMin, eloMax] en orden ascendente. Usa la propiedad del BST para podar: si
//  el nodo actual es menor que eloMin, solo explora el subárbol derecho; si es mayor que eloMax, solo explora el izquierdo.
public class Jugador {

    int elo;
    String nombreUsuario;
    String pais;
    int partidasJugadas;

    Jugador izquierda;
    Jugador derecha;

    public Jugador(int elo, String nombreUsuario, String pais, int partidasJugadas) {

        this.elo = elo;
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.partidasJugadas = partidasJugadas;

        izquierda = null;
        derecha = null;
    }
}