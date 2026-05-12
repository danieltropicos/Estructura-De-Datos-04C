// 4. Farmacia Automatizada (Dispensador Tubo LIFO)
// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales.
//  El personal introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar
//  es el primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer, 
// debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope 
// sea un medicamento seguro o la pila quede vacía.
public class Medicamento {

    String nombre;
    String lote;
    int diasParaVencer;

    Medicamento siguiente;

    public Medicamento(String nombre, String lote, int diasParaVencer) {
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "[ Nombre: " + nombre +
               " | Lote: " + lote +
               " | Días para vencer: " + diasParaVencer + " ]";
    }
}