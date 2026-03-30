import java.util.Scanner;

public class PARCIAL {
    public static void main(String[] args) throws Exception {
        int puntaje;
        int[] puntajes = new int[6];
        int buscar;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INGRESO DE PUNTAJES---");
        for (int i = 0; i<6;i++){
            System.out.println("Ingrese el puntaje " + (i+1));
            puntaje = sc.nextInt();
            puntajes[i]=puntaje;
        }
        int nn = puntajes.length;
        for (int x = 1; x < nn; x++) {
            int clave = puntajes[x];
                int j = x - 1;

                while (j >= 0 && puntajes[j]< clave) {
                    puntajes[j + 1] = puntajes[j];
                    j--;
                }

                puntajes[j + 1] = clave;  

        }
        
        System.out.print("---TABLA DE POSICIONES: ---" + "\n");
        for(int z = 0; z<puntajes.length;z++){
            System.out.println((z+1) +" Lugar: " + puntajes[z]);
        }
        System.out.println("--- BUSQUEDA LINEAL ---");
        System.out.println("Ingrese puntaje a buscar: ");
        buscar = sc.nextInt();
        for (int i = 0; i<puntajes.length; i++){
            if (puntajes[i]==buscar){
                System.out.println("El puntaje: "+ buscar + " se encontro en el lugar: "+ (i+1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
                System.out.println("No se encontró");
            }
        sc.close();
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}

    }5
}
