// 2. Urgencias Hospitalarias (Triaje)
// En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de atención.
//  Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento de llamar a un paciente, 
// el sistema debe mostrar su información completa.

// La Clase Paciente (Nodo): Debe contener cedula (String), nombreCompleto (String), edad (int) y sintomaPrincipal (String).
// El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista completa en 
// orden de atención.
// Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, imprima su información al momento
//  de ser atendido e imprima al final el total de pacientes procesados.
public class Paciente {

    String cedula;
    String nombreCompleto;
    int edad;
    String sintomaPrincipal;
    Paciente siguiente;

    public Paciente(String cedula, String nombreCompleto, int edad, String sintomaPrincipal) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sintomaPrincipal = sintomaPrincipal;
        this.siguiente=null;
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + "\nNombre: " + nombreCompleto + "\nEdad: " + edad + "\nSíntoma Principal: " + sintomaPrincipal;
    }
}