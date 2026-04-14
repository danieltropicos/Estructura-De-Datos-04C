// 3. Planificador de CPU (Algoritmo Round Robin)
// Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador entre varios procesos de forma 
// justa: cada proceso recibe un pequeño intervalo de tiempo llamado quantum. Si no termina, espera su siguiente turno.

// La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y prioridad (int - del 1 al 3).
// El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta el quantum del tiempoRestante 
// del proceso actual. Cuando tiempoRestante <= 0, el proceso termina y se elimina de la lista.
// Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en cada turno cuál proceso se está 
// ejecutando, cuánto tiempo le queda y si terminó. El ciclo debe terminar cuando la lista quede vacía. Al final, imprime
//  el orden en que terminaron los procesos.
public class Proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;
    Proceso siguiente;

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
    }
}