package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 08 — Evoluciones Preparadas. Nivel 2: Entrenador Intermedio.
 * Dado si cada Pokémon puede evolucionar (boolean), obtener solo los listos.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        List<PokemonSimple> equipo = List.of(
                new PokemonSimple("Pikachu", "Eléctrico", 1, true),
                new PokemonSimple("Raichu", "Eléctrico", 1, false),
                new PokemonSimple("Charmander", "Fuego", 1, true),
                new PokemonSimple("Charizard", "Fuego", 1, false),
                new PokemonSimple("Squirtle", "Agua", 1, true),
                new PokemonSimple("Blastoise", "Agua", 1, false)
        );

        // filter() con method reference sobre el campo booleano
        // puedeEvolucionar(): se queda solo con los que valen true.
        List<String> listosParaEvolucionar = equipo.stream()
                .filter(PokemonSimple::puedeEvolucionar)
                .map(PokemonSimple::nombre)
                .toList();

        System.out.println("Listos para evolucionar:");
        System.out.println(listosParaEvolucionar);
    }
}
