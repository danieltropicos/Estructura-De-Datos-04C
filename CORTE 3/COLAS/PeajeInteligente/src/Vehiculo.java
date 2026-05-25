// 4. Peaje Inteligente (Control de Tráfico)
// En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. 
// El sistema registra automáticamente cada vehículo al entrar al carril.
//  El cajero cobra en el orden estricto de llegada.

// La Clase Vehiculo (Nodo): Debe contener placa (String), tipoVehiculo (String), tarifa (double) y esExento (boolean).
// El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
// Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, acumule la tarifa solo
//  de los que tengan esExento = false e imprima el total recaudado al finalizar.
public class Vehiculo {

    String placa;
    String tipoVehiculo;
    double tarifa;
    boolean esExento;

    Vehiculo siguiente;

    public Vehiculo(String placa, String tipoVehiculo, double tarifa, boolean esExento) {

        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifa = tarifa;
        this.esExento = esExento;
        this.siguiente = null;
    }
}