package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 16 — Entrenadores Experimentados. Nivel 4: Alto Mando.
 * Mostrar solo los entrenadores con más de 5 medallas.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        List<EntrenadorSimple> entrenadores = List.of(
                new EntrenadorSimple("Ash", 8),
                new EntrenadorSimple("Misty", 5),
                new EntrenadorSimple("Brock", 6),
                new EntrenadorSimple("Gary", 10),
                new EntrenadorSimple("May", 3),
                new EntrenadorSimple("Dawn", 7)
        );

        // filter() con lambda sobre medallas > 5: se queda solo con los
        // entrenadores experimentados; map() los formatea como "Nombre(N)"
        // y collect(joining()) arma el texto final entre corchetes.
        String experimentados = entrenadores.stream()
                .filter(e -> e.medallas() > 5)
                .map(e -> e.nombre() + "(" + e.medallas() + ")")
                .collect(java.util.stream.Collectors.joining(", ", "[", "]"));

        System.out.println("Entrenadores con > 5 medallas:");
        System.out.println(experimentados);
    }
}
