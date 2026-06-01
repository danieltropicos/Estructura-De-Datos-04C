// 2. Catálogo Digital (Biblioteca Universitaria)
// La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave única. 
// Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. El sistema debe poder confirmar si 
// un ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.

// La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y anioPublicacion (int).
// El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo ordenado de menor a mayor por
//  ISBN para enviarlo a la sede central. También debe verificar si un ISBN específico ya existe en el catálogo antes de registrar
//  una donación.
// Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los libros en orden ascendente de 
// ISBN (imprime isbn - titulo - autor). Además, implementa existeISBN(long isbn) que retorne true si el libro ya está registrado 
// y false en caso contrario.

public class Libro {

    long isbn;
    String titulo;
    String autor;
    int anoPublicacion;

    Libro izquierda;
    Libro derecha;

    public Libro(long isbn, String titulo, String autor, int anoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.izquierda = null;
        this.derecha = null;
    }
}