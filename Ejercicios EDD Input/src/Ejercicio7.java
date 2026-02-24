// Ejercicio 7 — Arreglo compartido (inventario)
// Pide al usuario 4 precios para llenar un arreglo precios[]. 
// Crea preciosAuditoria = precios (misma referencia).
//  Pide al usuario el índice y el nuevo precio para hacer una corrección desde preciosAuditoria. Muestra ambos arreglos y verifica que el cambio se refleja en los dos.

// Datos de entrada: double × 4 precios, int índice, double nuevo precio

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios;
        double[] preciosauditoria;
        int indice;
        double precio;

        precios = new double[4];
        for (int i=0;i<4;i++){
            System.out.println("Ingrese el valor " +(i+1));
            precios[i] = sc.nextDouble();
        }
        for (int i=0;i<4;i++){
            System.out.println("Producto " + (i+1) + ":" +precios[i]);
        }
        preciosauditoria = precios;

        System.out.println("Dame el indice a cambiar en preciosauditoria");
        indice = sc.nextInt();
        System.out.println("Dame el precio del indice" + indice);
        precio = sc.nextInt();
        
        preciosauditoria[indice]=precio;

        System.out.println("Precios Auditoria: ");
        for (int i=0;i<4;i++){
            System.out.println("Producto " + (i+1) + ":" +preciosauditoria[i]);
        }

        System.out.println("Precios Normales POST-CAMBIO: ");
        for (int y=0;y<4;y++){
            System.out.println("Producto " + (y+1) + ":" + precios[y]);
        }
    System.out.println("Ambos cambiaron.");
    }
}
