import java.util.Scanner;

public class MainEmpleados {

    public static void main(String[] args) {

        ColasEmpleado empleados = new ColasEmpleado();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        empleados.insertar(
            new Empleado(1050,"Elmas Capito","Conductor",2500000));

        empleados.insertar(
            new Empleado(800,"Maria Esperanza Gomez","Auxiliar",1800000));

        empleados.insertar(
            new Empleado(1500,"Carlos Ruiz","Supervisor",3500000));

        empleados.insertar(
            new Empleado(500,"Claudia Lopez","Operaria",1700000));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE NOMINA ---");
            System.out.println("1. Buscar empleado con menor cedula");
            System.out.println("2. Buscar empleado con mayor cedula");
            System.out.println("3. Reporte de eficiencia");
            System.out.println("4. Registrar empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    empleados.buscarMinimo();
                    break;

                case 2:

                    empleados.buscarMaximo();
                    break;

                case 3:

                    empleados.reporteEficiencia();
                    break;

                case 4:

                    System.out.print("Cedula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();

                    empleados.insertar(
                        new Empleado(
                            cedula,
                            nombre,
                            cargo,
                            salario
                        )
                    );

                    System.out.println(
                        "Empleado registrado correctamente."
                    );

                    break;

                case 5:

                    System.out.println(
                        "Saliendo del sistema..."
                    );
                    break;

                default:

                    System.out.println(
                        "Opcion no valida."
                    );
            }

        } while (opcion != 5);

        scanner.close();
    }
}