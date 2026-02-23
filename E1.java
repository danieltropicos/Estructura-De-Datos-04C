//Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo,
//  código (número entero), semestre actual, promedio acumulado y si está matriculado o no.

public class E1 {
    public static void main(String[] args) {
        String nombre;
        int codigo;
        int semestre;
        double promedio;
        boolean matriculado;

        
        nombre = "Daniel Avila";
        codigo = 4333;
        semestre=4;
        promedio = 4.5;
        matriculado=true;


        System.out.println("===== FICHA DEL ESTUDIANTE =====");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (promedio>=3.0) {
            System.out.println("Estado APROBADO");
        }
        else {
            System.out.println("Estado REPROBADO");
        }




    }
    
}
