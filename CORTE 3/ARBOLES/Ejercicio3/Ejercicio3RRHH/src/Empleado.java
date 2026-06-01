// 3. Sistema de Nómina (Recursos Humanos)
// Una empresa de logística administra a sus empleados en un BST organizado por número de cédula.
//  El área de RRHH consulta frecuentemente el empleado con el menor y el mayor número de cédula para 
// procesar los extremos de la nómina. También necesita conocer la altura del árbol para auditar si la
//  estructura sigue siendo eficiente después de muchas incorporaciones.

// La Clase Empleado (Nodo): Debe contener cedula (long, clave del BST), nombreCompleto (String), cargo (String) y salario (double).
// El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el registro) y al de cédula más alta
//  (el más reciente), y también reportar la altura actual del árbol para verificar que las búsquedas siguen siendo eficientes.
// Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol izquierdo o derecho respectivamente
//  hasta llegar a una hoja e impriman los datos del empleado encontrado. Implementa también reporteEficiencia() que imprima la altura
//  actual del árbol y el número total de hojas (contarHojas()).
public class Empleado {

    long cedula;
    String nombreCompleto;
    String cargo;
    double salario;

    Empleado izquierda;
    Empleado derecha;

    public Empleado(long cedula, String nombreCompleto, String cargo, double salario) {

        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.salario = salario;

        izquierda = null;
        derecha = null;
    }
}