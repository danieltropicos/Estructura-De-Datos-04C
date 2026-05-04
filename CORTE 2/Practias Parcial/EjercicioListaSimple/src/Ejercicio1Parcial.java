import java.util.Scanner;

public class Ejercicio1Parcial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        Historial cola = new Historial();
        do{
            System.out.println(" --- MENU --- ");
            System.out.println("1. Agregar Pagina");
            System.out.println("2. Buscar URL");
            System.out.println("3. Ver Historial");
            System.out.println("4. Pagina TOP");
            System.out.println("5. Añadir paginas por defecto");
            System.out.println("0. Salir");
            System.out.println("Ingrese su opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese la URL de la pagina: ");
                    sc.nextLine();
                    String url = sc.nextLine();
                    if(url!=""){
                        System.out.print("Ingrese el titulo de la pagina: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingrese las visitas: ");
                        int visitas = sc.nextInt();
                        if (visitas==1){
                            cola.agregarPagina(url,titulo,visitas);
                        System.out.println("Agregado Exitosamente");
                        }
                        else {
                            System.out.println("Debe iniciar en 1 visita");
                        }
                        
                    }
                    else {
                        System.out.println("URL VACIA");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la URL a buscar de la pagina: ");
                    sc.nextLine();
                    String urlabuscar = sc.nextLine();
                    cola.BuscarID(urlabuscar,1);
                    System.out.println("+1 Visita");
                    break;
                case 3:
                    cola.mostrarPaginas();
                    break;
                case 4:
                    cola.PaginaTop();
                    break;
                case 5:
                    cola.agregarPagina("https://yutu","Gang Style",1);
                    cola.agregarPagina("https://tito","tutorial",1);
                    cola.agregarPagina("https://chatgpt","parcial",1);
                    cola.agregarPagina("https://cuevana","pelicula",1);
                    break;
                case 0:
                    System.out.println("Adios...");
            }
        }while (opc != 0);
    
        sc.close();
    }
}
