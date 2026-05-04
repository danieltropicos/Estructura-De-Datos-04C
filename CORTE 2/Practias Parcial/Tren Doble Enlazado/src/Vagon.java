// En el mundo ferroviario, un tren de carga puede necesitar dividirse en dos en medio de una estación para tomar rutas distintas.

// El Escenario: Tienes una ListaDoble que representa un tren. Cada nodo es un Vagon con un id y un tipoCarga.
// El Reto: Implementa el método dividirTren(String vagonID):
// Debes buscar el vagón con ese ID.
// A partir de ese vagón (inclusive), el tren se "parte".
// El método debe devolver una nueva ListaDoble que contenga todos los vagones que estaban desde el punto de ruptura
//  hacia atrás.
// La lista original debe quedar recortada correctamente, con su nueva Cola y sus punteros finales en null.
// ¿Por qué lista doble? Porque al encontrar el punto de ruptura, necesitas actualizar el siguiente del vagón 
// anterior y el anterior del vagón actual de forma inmediata.
public class Vagon {
    String id;
    String tipoCarga;
    Vagon siguiente;
    Vagon anterior;

    public Vagon(String id, String tipoCarga) {
        this.id = id;
        this.tipoCarga = tipoCarga;
        this.siguiente = null;
        this.anterior = null;
    }
}