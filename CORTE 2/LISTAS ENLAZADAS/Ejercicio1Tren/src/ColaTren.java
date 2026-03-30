public class ColaTren {
  Vagon cabeza;

  public ColaTren() {
    this.cabeza = null;
  }

  public void agregarVagon(Vagon nuevoVagon) {

    if (cabeza == null) {
      cabeza = nuevoVagon;
    } else {
      Vagon actual = cabeza;
      while (actual.siguiente != null) {
        actual = actual.siguiente;
      }
      actual.siguiente = nuevoVagon;
    }
  }

  public double calcularPesoTotal() {
    double pesoTotal = 0.0;
    Vagon actual = cabeza;

    while (actual != null) {
      pesoTotal += actual.pesoToneladas;
      actual = actual.siguiente;
    }

    return pesoTotal;
  }
  public void mostrarVagones() {
    Vagon actual = cabeza;

    while (actual != null) {
      System.out.println("Contenido: " + actual.contenido +  " | Peso: " + actual.pesoToneladas + " | Origen: " + actual.origen + " | Destino: " + actual.destino);
      actual = actual.siguiente;
    }
}
}