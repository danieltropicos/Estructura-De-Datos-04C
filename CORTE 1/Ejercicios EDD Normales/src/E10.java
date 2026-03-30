// Ejercicio 10 — Copiando configuración
// Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).

// Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
// Modifica la copia y demuestra que el original no cambia.
// Comenta la diferencia con la asignación directa.
public class E10 {
    public static void main(String[] args) {
        int[] configuracion = {1920, 1080, 60};
        int[] copia = new int[configuracion.length];
        for (int i=0; i < configuracion.length; i++) {
            copia[i]=configuracion[i];
        }
        System.out.println("Original: ");
        for (int x = 0; x<configuracion.length;x++) {
            System.out.print(configuracion[x] + " ");
        }
        System.out.println(" ");
        System.out.println("Copia: ");
        for (int y = 0; y<copia.length;y++) {
            System.out.print(copia[y] + " ");
        }

        copia[0] = 1280;
        copia[1] = 720;
        copia[2] = 30;
        System.out.println(" ");
        System.out.println("Se cambiaron los valores de Copia");
        System.out.println("Copia POST-CAMBIO: ");
        for (int y = 0; y<copia.length;y++) {
            System.out.print(copia[y] + " ");
        }
        System.out.println(" ");
        System.out.println("Original POST-CAMBIO: ");
        for (int x = 0; x<configuracion.length;x++) {
            System.out.print(configuracion[x] + " ");
        }
    }
}
// Que pasó? Pasa que hicimos una copia REAL, con el comando NEW,
//  y luego copiamos elemento por elemento con un for, no es lo mismo que hacer copia = original y ya, esto si crea un nuevo arreglo independientes