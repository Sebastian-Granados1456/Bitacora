import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejecuta las 3 pruebas eliminatorias del juego sobre una lista de Jugador.
 * El premio que deja cada eliminado se acumula y, junto con el premio
 * inicial, se reparte entre los finalistas al terminar la última prueba.
 */
public class JuegoCalamar {

    private static final long PREMIO_INICIAL = 150_000_000_000L;
    private static final long PREMIO_PRUEBA_1_2 = 50_000_000L;
    private static final long PREMIO_PRUEBA_3 = 100_000_000L;

    private long premioAcumulado = 0;

    // Prueba 1 - Luz Roja Luz Verde: filtra (sin bucle for) a los jugadores
    // con deuda <= 170M usando stream().filter() + collect(); por cada
    // eliminado se suman 50M al premio acumulado del juego.
    public List<Jugador> luzRojaLuzVerde(List<Jugador> jugadores) {
        List<Jugador> eliminados = jugadores.stream()
                .filter(j -> j.getDeuda() > 170_000_000L)
                .collect(Collectors.toList());
        eliminados.forEach(j -> j.setEstado("ELIMINADO"));
        premioAcumulado += eliminados.size() * PREMIO_PRUEBA_1_2;

        return jugadores.stream()
                .filter(j -> j.getDeuda() <= 170_000_000L)
                .collect(Collectors.toList());
    }

    // Prueba 2 - Los Dados: cada jugador tiene un dado asignado (1-6) y
    // solo avanzan los que sacan número PAR; se usa stream().filter() con
    // lambda sobre el resultado del dado. Cada eliminado suma 50M al premio.
    public List<Jugador> losDados(List<Jugador> jugadores, java.util.Map<Jugador, Integer> dados) {
        List<Jugador> eliminados = jugadores.stream()
                .filter(j -> dados.get(j) % 2 != 0)
                .collect(Collectors.toList());
        eliminados.forEach(j -> j.setEstado("ELIMINADO"));
        premioAcumulado += eliminados.size() * PREMIO_PRUEBA_1_2;

        return jugadores.stream()
                .filter(j -> dados.get(j) % 2 == 0)
                .collect(Collectors.toList());
    }

    // Prueba 3 - Puente de Cristal: solo pasan los jugadores cuyo primer
    // nombre tenga 5 o más caracteres; usa únicamente lambdas dentro de
    // filter(), sin estructuras de control imperativas. Cada eliminado
    // suma 100M al premio acumulado (más alto porque es la prueba final).
    public List<Jugador> puenteDeCristal(List<Jugador> jugadores) {
        List<Jugador> eliminados = jugadores.stream()
                .filter(j -> j.getPrimerNombre().length() < 5)
                .collect(Collectors.toList());
        eliminados.forEach(j -> j.setEstado("ELIMINADO"));
        premioAcumulado += eliminados.size() * PREMIO_PRUEBA_3;

        return jugadores.stream()
                .filter(j -> j.getPrimerNombre().length() >= 5)
                .collect(Collectors.toList());
    }

    // Declara ganador(es) al final del juego: reparte en partes iguales el
    // premio inicial más todo lo acumulado por eliminaciones durante las
    // 3 pruebas (si solo queda un finalista, se lo lleva todo).
    public void declararGanadores(List<Jugador> finalistas) {
        long premioTotal = PREMIO_INICIAL + premioAcumulado;
        long parte = premioTotal / finalistas.size();
        finalistas.forEach(j -> {
            j.agregarPremio(parte);
            j.setEstado("GANADOR");
        });
    }
}
