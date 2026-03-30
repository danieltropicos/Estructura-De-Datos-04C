import java.util.Scanner;
public class RETO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[5];
        int suma = 0;
        double mayor = 0;
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el valor " +(i+1));
            precios[i] = sc.nextDouble();
        }

        for (int i=0;i<5;i++){
            suma += precios[i];
        }
        System.out.println("La suma total es: " + suma);
        for (int i=0;i<5;i++){
            if (precios[i]>mayor){
                mayor=precios[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        
        if (suma>20000){
            System.out.println("Tienes un descuento de 2000");
            System.out.println("El total es: " + (suma-2000));
        }
        else {
            System.out.println("El total es: " + (suma));
        }
        sc.close();
    }
}
