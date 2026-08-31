package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 06 — Pokédex Sin Duplicados. Nivel 2: Entrenador Intermedio.
 * Dada una lista con nombres repetidos, dejar cada Pokémon una sola vez.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Pikachu", "Charmander", "Pikachu",
                "Squirtle", "Charmander", "Mewtwo");

        // distinct() elimina los duplicados manteniendo el orden de
        // primera aparición, sin necesidad de un Set manual.
        List<String> sinDuplicados = nombres.stream()
                .distinct()
                .toList();

        System.out.println(sinDuplicados);
    }
}
