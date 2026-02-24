// Ejercicio 9 — Notas de un curso
// Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.

// El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
// Muestra que el arreglo del profesor también refleja el cambio.
// Añade comentarios explicando el concepto de referencia en memoria.
public class E9 {
    public static void main(String[] args) {
        double[] notasprofesor = {4.5, 2.5, 3.8, 4.0};
        double[] notasCoordinador = notasprofesor;



        System.out.println("Nota del estudiante 2 (Profe): " + notasprofesor[1]);
        System.out.println("Se cambia a 3");
        notasCoordinador[1]=3.0;
        System.out.println("Nota del estudiante 2 (Cambio del Coordinador): " + notasCoordinador[1]);
        System.out.println("Nota del estudiante 2 (Profe) POST-CAMBIO: " + notasprofesor[1]);
        


    }
}

// Como ya dije en el ejercicio 7, cuando se hace una copia de una array, es enrealidad el mismo arreglo, apunta a el mismo lugar.