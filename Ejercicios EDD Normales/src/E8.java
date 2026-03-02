// Ejercicio 8 — Historial de mensajes
// Un chat guarda el último mensaje enviado. Se usan dos variables String:

// ultimoMensaje = "Hola"
// copiaTexto = ultimoMensaje
// Luego copiaTexto se cambia a "¿Cómo estás?"
// Muestra ambas variables y explica en un comentario por qué ultimoMensaje
//  no cambió (inmutabilidad de String).
public class E8 {
    public static void main(String[] args) {

        String ultimomensaje = "Hola, ¿que tal?, ¿como te va?";
        String copiatexto;

        copiatexto=ultimomensaje;

        System.out.println("Ultimo Mensaje: "+ ultimomensaje);
        System.out.println("Copia de texto: "+ copiatexto);
        System.out.println("Como estás?");

        copiatexto="Que frase mas vulgar";

        System.out.println("Ultimo Mensaje POST-CAMBIO: "+ ultimomensaje);
        System.out.println("Copia de texto POST-CAMBIO: "+ copiatexto);
        





    }
    
}
