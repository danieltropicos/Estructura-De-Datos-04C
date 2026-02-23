// Ejercicio 3 — Sensor de temperatura
// Un sensor industrial registra temperaturas. El sistema recibe:

// Temperatura actual en Celsius (double)
// Nombre del sensor (String)
// Número de lectura (int)
// Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
// Imprime el estado del sensor con todos sus datos.



public class E3 {
    public static void main(String[] args) {

        double celsius;
        String sensor;
        int lectura;
        boolean enalarma;

        celsius = 100;
        sensor = "Sensor Bueno";
        lectura = 8899;


        if (celsius>80) {
            enalarma=true;
        }
        else {
            enalarma=false;
        }

        System.out.println("Temperatura actual en Celsius: "+ celsius);
        System.out.println("Nombre Sensor: "+ sensor);
        System.out.println("Numero de Lectura: "+ lectura);
       System.out.println("Alarma: "+ enalarma);




    }
    
}
