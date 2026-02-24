// Ejercicio 6 — Turno en un banco
// Un cajero de banco trabaja con el número del turno actual. Se crea 
// una variable turnoActual y se asigna a turnoEnPantalla.

// Demuestra con código que cambiar turnoEnPantalla no afecta a 
// turnoActual (comportamiento por valor).
// Explica en un comentario por qué ocurre esto.
public class E6 {
    public static void main(String[] args) {

        int turnoactual;
        int turnoenpantalla;

        turnoactual=66;
        turnoenpantalla = turnoactual;
        System.out.println("Turno Actual Normal: "+ turnoactual);
        System.out.println("Turno Pantalla Normal: "+ turnoenpantalla);

        
        turnoenpantalla=99;

        System.out.println("Turno Actual despues del cambio:" + turnoactual);
        System.out.println("Turno en Pantalla despues del cambio:" + turnoenpantalla);



    }
    
}
