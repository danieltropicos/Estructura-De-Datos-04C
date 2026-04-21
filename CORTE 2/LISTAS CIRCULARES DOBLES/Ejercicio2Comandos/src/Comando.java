// 2. Historial de Comandos de Terminal
// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior;
//  flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio
//  (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba"
//  mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el comando 
// actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
// navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo
//  con el cursor marcado.
public class Comando{
    String texto;
    boolean exitoso;
    String directorio;
    Comando anterior;
    Comando siguiente;

    public Comando(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
        this.anterior = null;
        this.siguiente = null;
    }
}