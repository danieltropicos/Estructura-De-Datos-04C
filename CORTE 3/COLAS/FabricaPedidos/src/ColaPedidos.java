public class ColaPedidos {

    private Pedido salida;
    private Pedido entrada;
    private int tamanio;

    public ColaPedidos() {

        salida = null;
        entrada = null;
        tamanio = 0;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public int size() {
        return tamanio;
    }

    // Agregar pedido
    public void enqueue(Pedido pedido) {

        Pedido nuevo = pedido;

        if (isEmpty()) {

            salida = nuevo;
            entrada = nuevo;

        } else {

            entrada.siguiente = nuevo;
            entrada = nuevo;
        }

        tamanio++;
    }

    public Pedido dequeue() {

        if (isEmpty()) {

            System.out.println("No hay pedidos en cola");
            return null;
        }

        Pedido pedido = salida;

        salida = salida.siguiente;

        if (salida == null) {
            entrada = null;
        }

        tamanio--;

        return pedido;
    }

    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("Salida > ");

        Pedido actual = salida;

        while (actual != null) {

            System.out.print(
                actual.numeroPedido +
                " - " +
                actual.cliente +
                " [$" + actual.totalPagar + "]"
            );

            if (actual.cancelado) {
                System.out.print(" [CANCELADO]");
            }

            if (actual.siguiente != null) {
                System.out.print(" > ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public void procesarPedidos() {

        int totalDespachados = 0;
        int totalCancelados = 0;

        while (!isEmpty()) {

            Pedido pedido = dequeue();

            if (pedido.cancelado) {

                System.out.println(
                    "\nPedido cancelado descartado: " +
                    pedido.numeroPedido
                );

                totalCancelados++;

            } else {

                System.out.println("Pedido despachado:");
                System.out.println("Numero: " + pedido.numeroPedido);
                System.out.println("Cliente: " + pedido.cliente);
                System.out.println("Total a pagar: $" + pedido.totalPagar);

                totalDespachados++;
            }
        }

        System.out.println("Pedidos despachados: " + totalDespachados);
        System.out.println("Pedidos cancelados: " + totalCancelados);
    }
}