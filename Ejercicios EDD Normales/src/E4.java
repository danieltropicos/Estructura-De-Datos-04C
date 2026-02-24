// Ejercicio 4 — Placa de un vehículo
// El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

// Placa (String)
// Año de fabricación (int)
// Cilindraje en cc (int)
// Precio de compra (double)
// Inicial del color (char)
// Si tiene SOAT vigente (boolean)
// Muestra todos los datos en consola.


public class E4 {
    public static void main(String[] args) {

        String placa;
        int año;
        int cc;
        double precio;
        char inicial;
        boolean soat;

        placa = "GPY53H";
        año = 2025;
        cc = 125;
        precio = 5500000.00;
        inicial = 78;
        soat = false;



        System.out.println("PLACA: "+ placa);
        System.out.println("Año: "+ año);
        System.out.println("Cilindraje: "+ cc);
        System.out.println("Precio: "+ precio);
        System.out.println("Inicial del Color: "+ inicial);
        if (soat==true) {
            System.out.println("El SOAT esta vigente");
        }
        else {
            System.out.println("El SOAT esta vencido");
        }
        




    }
}
