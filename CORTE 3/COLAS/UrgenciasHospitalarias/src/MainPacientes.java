import java.util.Scanner;

public class MainPacientes {

    public static void main(String[] args) throws Exception {

        ColaPacientes pacientes = new ColaPacientes();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        pacientes.enqueue(new Paciente("1001", "Juan Perez", 30, "Dolor de cabeza"));
        pacientes.enqueue(new Paciente("1002", "Maria Gomez", 25, "Fiebre alta"));
        pacientes.enqueue(new Paciente("1003", "Carlos Ruiz", 40, "Dificultad para respirar"));
        pacientes.enqueue(new Paciente("1004", "Ana Torres", 19, "Dolor abdominal"));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE URGENCIAS HOSPITALARIAS ---");
            System.out.println("1. Ver pacientes en espera");
            System.out.println("2. Registrar paciente (Enqueue)");
            System.out.println("3. Atender paciente (Dequeue)");
            System.out.println("4. Atender todos los pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nPacientes en espera:");
                    pacientes.imprimir();

                    break;

                case 2:

                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Síntoma principal: ");
                    String sintoma = scanner.nextLine();

                    pacientes.enqueue(
                        new Paciente(
                            cedula,
                            nombre,
                            edad,
                            sintoma
                        )
                    );

                    System.out.println("Paciente registrado correctamente.");

                    break;

                case 3:

                    Paciente atendido = pacientes.dequeue();

                    if (atendido != null) {

                        System.out.println("\nPaciente atendido:");
                        System.out.println(
                            atendido.cedula + " " +
                            atendido.nombreCompleto +
                            " (" + atendido.sintomaPrincipal + ")" +
                            " Edad: " + atendido.edad
                        );

                    } else {

                        System.out.println("No hay pacientes en espera.");
                    }

                    break;

                case 4:

                    pacientes.atenderTodos();

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}