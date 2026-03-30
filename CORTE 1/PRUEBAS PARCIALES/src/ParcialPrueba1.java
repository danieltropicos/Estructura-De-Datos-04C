import java.util.Scanner;


public class ParcialPrueba1 {
    public static void main(String[] args) throws Exception {
        Producto productos[] = new Producto[5];
        int buscar;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- REGISTRO DE PRODUCTOS ---");
        for(int i = 0;i<5;i++){
            System.out.println("Escriba el producto " + (i+1) + ":");
            productos[i]=AgregarProducto();
        }
        System.out.print("Original: " + "\n");
        imprimirArreglo(productos);

        // 2. Algoritmo Shell
        int n = productos.length;

        // Empezar con un gap grande y reducirlo a la mitad en cada paso
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            // Hacer un ordenamiento por inserción para este gap
            for (int i = gap; i < n; i++) {
                Producto temp = productos[i];
                int j;
                for (j = i; j >= gap && productos[j - gap].id > temp.id; j -= gap) {
                    productos[j] = productos[j - gap];
                }
                productos[j] = temp;
            }
            
        }

        // 3. Resultado final
        System.out.print("Ordenado: " + "\n");
        imprimirArreglo(productos);
        int inicio = 0;
        int fin = productos.length - 1;
        int posicionEncontrada = -1;
        System.out.println("Ingrese el ID a buscar: ");
        buscar = sc.nextInt();
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // ¿Está en el medio?
            if (productos[medio].id == buscar) {
                posicionEncontrada = medio;
                break;
            }

            // Si el valor del medio es menor, buscamos a la derecha
            if (productos[medio].id < buscar) {
                inicio = medio + 1;
            }
            // Si el valor del medio es mayor, buscamos a la izquierda
            else {
                fin = medio - 1;
            }
        }
        if (posicionEncontrada != -1) {
            System.out.println("PRODUCTO ENCONTRADO: " + productos[posicionEncontrada].nombre + "- Precio: " + productos[posicionEncontrada].precio + "- Stock: " + productos[posicionEncontrada].stock);

        } else {
            System.out.println("No existe");
        }
        sc.close();

    
    }
    
    
    public static class Producto
    {
        public int id;
        public String nombre;
        public double precio;
        public int stock;
        public Producto(int id, String nombre, double precio, int stock){
            this.id=id;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

    }

    public static Producto AgregarProducto(){
        Scanner sc = new Scanner(System.in);
        int idpro;
        String nombrepro;
        double preciopro;
        int stockpro;
        System.out.println("Ingrese ID: ");
        idpro  = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese Nombre: ");
        nombrepro  = sc.nextLine();
        
        System.out.println("Ingrese precio: ");
        preciopro  = sc.nextDouble();
        
        System.out.println("Ingrese stock: ");
        stockpro  = sc.nextInt();
        return new Producto(idpro,nombrepro,preciopro,stockpro);
        
    }
    public static void imprimirArreglo(Producto[] productos) {
        for (Producto d : productos) {
            System.out.print(" ID: " + d.id + "|" + "Nombre: " + d.nombre + "|" + "Precio: " + d.precio + "|" + "Stock: " + d.stock + "\n");
        }
        System.out.println();
    }
    
}
