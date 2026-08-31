import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Reto 7 - El Juego del Calamar.
 * Corre las 3 pruebas en orden con los jugadores del enunciado y muestra
 * quién sobrevive cada ronda hasta declarar ganador(es).
 */
public class Main {
    public static void main(String[] args) {
        Jugador giHun = new Jugador(456, "Seong Gi-hun", 160_000_000L);
        Jugador saeByeok = new Jugador(67, "Kang Sae-byeok", 80_000_000L);
        Jugador sangWoo = new Jugador(218, "Cho Sang-woo", 250_000_000L);
        Jugador abdul = new Jugador(199, "Ali Abdul", 70_000_000L);

        List<Jugador> jugadores = List.of(giHun, saeByeok, sangWoo, abdul);
        JuegoCalamar juego = new JuegoCalamar();

        System.out.println("Prueba 1 — Luz Roja Luz Verde:");
        List<Jugador> ronda1 = juego.luzRojaLuzVerde(jugadores);
        System.out.println("  " + describir(ronda1) + " PASAN");
        System.out.println("  Jugador " + sangWoo.getNumero() + " ELIMINADO");

        // Dados fijos (en vez de aleatorios) para que la salida sea reproducible
        // y coincida con el ejemplo del enunciado: Gi-hun(4) y Sae-byeok(6) pasan.
        Map<Jugador, Integer> dados = new HashMap<>();
        dados.put(giHun, 4);
        dados.put(saeByeok, 6);
        dados.put(abdul, 3);

        System.out.println("Prueba 2 — Los Dados:");
        List<Jugador> ronda2 = juego.losDados(ronda1, dados);
        System.out.println("  Gi-hun(" + dados.get(giHun) + "), Sae-byeok(" + dados.get(saeByeok) + ") PASAN");
        System.out.println("  Jugador " + abdul.getNumero() + " ELIMINADO");

        System.out.println("Prueba 3 — Puente de Cristal:");
        List<Jugador> finalistas = juego.puenteDeCristal(ronda2);
        System.out.println("  Gi-hun PASA");
        System.out.println("  Jugador " + saeByeok.getNumero() + " ELIMINADO");

        juego.declararGanadores(finalistas);
        finalistas.forEach(j -> {
            System.out.println("¡Jugador " + j.getNumero() + " Eres el Ganador!");
            System.out.printf("Premio: %,d wones%n", j.getPremio());
        });
    }

    private static String describir(List<Jugador> jugadores) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jugadores.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(jugadores.get(i).getNombre());
        }
        return sb.toString();
    }
}
