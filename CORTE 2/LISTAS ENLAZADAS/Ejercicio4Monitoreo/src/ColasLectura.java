public class ColasLectura {
    Lectura cabeza;

    public ColasLectura() {
        this.cabeza = null;
    }
    public void mostrarLecturas(){
        Lectura actual = cabeza;
        while(actual != null){
            System.out.println("ID SENSOR: " + actual.idSensor + " | TEMPERATURA: " + actual.temperatura + " | PRESION: " + actual.presion + " | HORA: " + actual.hora + " | ");
            actual = actual.siguiente;
        }
    }

    public void AgregarLectura(Lectura nuevaLectura) {
        nuevaLectura.siguiente = cabeza; 
        cabeza = nuevaLectura; 
    }
    public void mostrarTemperaturaMaxima() {
    if (cabeza == null) {
        System.out.println("No hay lecturas registradas");
        return;
    }

    Lectura actual = cabeza;
    Lectura max = cabeza;

    while (actual != null) {
        if (actual.temperatura > max.temperatura) {
            max = actual;
        }
        actual = actual.siguiente;
    }

    System.out.println("Lectura con mayor temperatura:");
    System.out.println("Sensor: " + max.idSensor);
    System.out.println("Temperatura: " + max.temperatura);
    System.out.println("Presión: " + max.presion);
    System.out.println("Hora: " + max.hora);
    }

}
