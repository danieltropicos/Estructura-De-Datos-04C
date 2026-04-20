import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Fixture {

    ArrayList<Equipo> equipos;

    public Fixture() {
        equipos = new ArrayList<>();
    }

    // agregar equipo
    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    // 
    public void generarFixture() {

        int n = equipos.size();

        if (n != 6) {
            System.out.println("Se necesitan 6 equipos si o si");
            return;
        }

        ArrayList<Equipo> lista = new ArrayList<>(equipos);
        Random rand = new Random();

        int jornadas = n - 1;

        for (int j = 0; j < jornadas; j++) {

            System.out.println("\n===== JORNADA " + (j + 1) + " =====");

            for (int i = 0; i < n / 2; i++) {

                Equipo local = lista.get(i);
                Equipo visitante = lista.get(n - 1 - i);

                int golesLocal = rand.nextInt(5);
                int golesVisitante = rand.nextInt(5);

                System.out.println(local.nombre + " (" + golesLocal + ") vs "
                        + visitante.nombre + " (" + golesVisitante + ")");

                // actualizar goles
                local.golesFavor += golesLocal;
                visitante.golesFavor += golesVisitante;

                // puntos
                if (golesLocal > golesVisitante) {
                    local.puntos += 3;
                } else if (golesLocal < golesVisitante) {
                    visitante.puntos += 3;
                } else {
                    local.puntos += 1;
                    visitante.puntos += 1;
                }
            }

            // rotacion
            Equipo ultimo = lista.remove(lista.size() - 1);
            lista.add(1, ultimo);
        }

        mostrarTabla();
    }

    public void mostrarTabla() {

        System.out.println("\n===== TABLA DE POSICIONES =====");

        Collections.sort(equipos, new Comparator<Equipo>() {
            public int compare(Equipo e1, Equipo e2) {
                return e2.puntos - e1.puntos;
            }
        });

        for (Equipo e : equipos) {
            System.out.println(e.nombre +
                    " | Ciudad: " + e.ciudad +
                    " | Puntos: " + e.puntos +
                    " | Goles: " + e.golesFavor);
        }
    }
}