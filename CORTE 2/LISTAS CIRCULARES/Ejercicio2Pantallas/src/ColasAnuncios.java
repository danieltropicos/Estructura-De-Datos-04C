public class ColasAnuncios {

    Anuncio cabeza;
    Anuncio cola;

    public ColasAnuncios() {
        cabeza = null;
        cola = null;
    }

    public void agregarAnuncio(Anuncio nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza; 
        }
    }
    public void mostrarAnuncios() {
        System.out.println("------------ ANUNCIOS ---------------");
        if (cabeza == null) {
            System.out.println("No hay anuncios");
            return;
        }
        Anuncio temp = cabeza;
        do {
            System.out.println("Título: " + temp.titulo);
            System.out.println("Duración: " + temp.duracionSegundos + "s");
            System.out.println("Categoría: " + temp.categoria);
            System.out.println("Veces repetido: " + temp.vecesRepetido);
            System.out.println("---------------------------");

            temp = temp.siguiente;

        } while (temp != cabeza);
    }
    public void reproducir(int ciclos) {

        if (cabeza == null) {
            System.out.println("No hay anuncios");
            return;
        }
        Anuncio actual = cabeza;
        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;
        for (int i = 0; i < ciclos; i++) {
            System.out.println("Mostrando: " + actual.titulo +  " | Duración: " + actual.duracionSegundos + "s" + " | Categoría: " + actual.categoria);
            actual.vecesRepetido++;
            tiempoTotal += actual.duracionSegundos;
            if (actual.vecesRepetido > masRepetido.vecesRepetido) {
                masRepetido = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("Más repetido:");
        System.out.println(masRepetido.titulo + " - " + masRepetido.vecesRepetido + " veces");
        System.out.println("Tiempo total: " + tiempoTotal + " segundos");
    }
}