// Reto 2: Editor de Capas de Diseño (Photoshop/Canva)
// En los programas de diseño, los objetos están uno encima de otro. El orden en la lista determina qué objeto tapa a cuál (el "Z-Order").

// El Escenario: Cada Capa (nodo) tiene un nombre y un color. La Cabeza es la capa que está más al fondo y la Cola es la que está al frente (la que el usuario ve primero).
// El Reto: Implementa los métodos:
// enviarAlFondo(String nombre): Busca la capa y muévela para que sea la nueva Cabeza.
// traerAlFrente(String nombre): Busca la capa y muévela para que sea la nueva Cola.
// Restricción: No puedes simplemente cambiar los nombres de los nodos. Debes desconectar el nodo físicamente de donde esté y volverlo a conectar en el extremo correspondiente, asegurando que los vecinos que dejó atrás ahora se conecten entre sí.
class Capa {
    String nombre;
    String color;
    Capa siguiente;
    Capa anterior;

    public Capa(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.siguiente = null;
        this.anterior = null;
    }
}