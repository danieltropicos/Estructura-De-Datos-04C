// 3. Sensor de Temperatura (Control de Calidad)
// Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

// El Problema: Al final del día, el supervisor quiere saber 
// cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
// Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor 
// para encontrar el mayor de todos.

public class Array3 {
    public static void main(String[] args){
        int[] temperaturas = {
            23,25,19,30,28,22,24,27,31,26,
            21,29,33,20,18,34,32,35,24,23,
            26,27,28,29,30,31,32,33,34,35,
            22,21,20,19,18,25,24,23,26,27,
            28,29,30,31,32,33,34,35,36,22,
            23,24,25,26,27,28,29,30,31,32,
            33,34,35,36,21,22,23,24,25,26,
            };
            int mayor = 0;
        for(int i = 0; i<temperaturas.length;i++){
            if (temperaturas[i]>mayor){
                mayor=temperaturas[i];
            }
        }
        System.out.println("La mayor temperatura registrada fue: " + mayor);
    }
}
