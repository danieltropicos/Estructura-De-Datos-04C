// 3. Navegación de Pestañas de Navegador
// Imagina un navegador donde puedes moverte entre pestañas abiertas.

// La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
// El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco 
// debe pasar a la pestaña anterior.
// Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la elimine de la lista
//  y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).
public class Pestana {
    String tituloPagina;
    String url;
    String horaApertura;
    Pestana anterior;
    Pestana siguiente;

    public Pestana(String tituloPagina, String url, String horaApertura) {
        this.tituloPagina = tituloPagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.anterior = null;
        this.siguiente = null;
    }
}