import java.util.Scanner;

public class MainAjedrez {

    public static void main(String[] args) {

        ColaJugadores jugadores = new ColaJugadores();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        jugadores.insertar(new Jugador(1700, "EsoTilin", "Argentina", 180));
        jugadores.insertar(new Jugador(2200, "Netanyahu", "Mexico", 500));
        jugadores.insertar(new Jugador(1500, "Trun", "Peru", 120));
        jugadores.insertar(new Jugador(1900, "ElPepe", "Chile", 260));
        jugadores.insertar(new Jugador(2100, "KrisR", "España", 420));
        jugadores.insertar(new Jugador(2400, "Efren Reyes", "Tailandia", 800));
        jugadores.insertar(new Jugador(2000, "dakidead", "Colombia", 350));


        int opcion;

        do {

            System.out.println("\n--- TORNEO DE AJEDREZ ---");
            System.out.println("1. Ver jugadores por rango ELO");
            System.out.println("2. Registrar jugador");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("ELO minimo: ");
                    int minimo = scanner.nextInt();

                    System.out.print("ELO maximo: ");
                    int maximo = scanner.nextInt();

                    jugadores.listarEnRango(
                        minimo,
                        maximo
                    );

                    break;

                case 2:

                    System.out.print("ELO: ");
                    int elo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre usuario: ");
                    String nombre =
                        scanner.nextLine();

                    System.out.print("Pais: ");
                    String pais =
                        scanner.nextLine();

                    System.out.print("Partidas jugadas: ");
                    int partidas =
                        scanner.nextInt();

                    jugadores.insertar(
                        new Jugador(elo,nombre,pais,partidas));

                    System.out.println(
                        "Jugador registrado."
                    );

                    break;

                case 4:

                    System.out.println(
                        "Saliendo del sistema..."
                    );

                    break;
                case 3:

                    jugadores.mostrarTodos();

                    break;
                default:

                    System.out.println(
                        "Opcion no valida."
                    );
            }

        } while (opcion != 4);

        scanner.close();
    }
}