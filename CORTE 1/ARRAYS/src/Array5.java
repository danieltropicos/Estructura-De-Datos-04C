// 5. Contador de Estudiantes (Registro Académico)
// Un profesor tiene un arreglo con las notas finales de 30 estudiantes (ej: 3.5, 4.0, 2.8, 5.0, ...).

// El Problema: El profesor necesita saber exactamente cuántos estudiantes sacaron una nota de 5.0.
// Algoritmo a usar: Búsqueda Lineal con Contador. Debes recorrer todo el arreglo y, cada vez que 
// encuentres un 5.0, aumentar una variable contador.
public class Array5 {
    public static void main(String[] args){
        double[] notasFinales = {
            3.5, 4.2, 2.8, 5.0, 1.9,
            3.1, 4.8, 2.3, 3.9, 4.0,
            1.5, 2.7, 3.3, 4.6, 2.1,
            3.8, 4.4, 1.2, 2.9, 3.0,
            4.9, 2.4, 3.6, 1.8, 4.1,
            2.0, 3.7, 4.3, 1.7, 2.6,
            3.2, 4.7, 2.2, 3.4, 1.4,
            2.5, 3.9, 4.5, 1.6, 2.8,
            3.0, 4.8, 2.3, 3.5, 1.1,
            2.7, 3.8, 4.2, 1.3, 2.9,
            5.0, 4.4, 5.0, 5.0, 2.0,
        };
        int contador = 0;
        for (int i = 0; i<notasFinales.length;i++){
            if (notasFinales[i]==5){
                contador++;
            }
        }
        System.out.println("Se encontraron " + contador + " notas correspondientes a 5 (Superior)!");
    }
}
