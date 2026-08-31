package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 01 — Pokémon Tipo Fuego. Nivel 1: Entrenador Novato.
 * Dada una lista de Pokémon con nombre y tipo, obtener solo los de tipo Fuego.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        List<PokemonSimple> equipo = List.of(
                new PokemonSimple("Pikachu", "Eléctrico", 1, false),
                new PokemonSimple("Charmander", "Fuego", 1, false),
                new PokemonSimple("Squirtle", "Agua", 1, false),
                new PokemonSimple("Vulpix", "Fuego", 1, false),
                new PokemonSimple("Bulbasaur", "Planta", 1, false),
                new PokemonSimple("Flareon", "Fuego", 1, false)
        );

        // filter() con lambda: se queda solo con los Pokémon cuyo tipo sea "Fuego".
        List<String> tipoFuego = equipo.stream()
                .filter(p -> p.tipo().equals("Fuego"))
                .map(PokemonSimple::nombre)
                .toList();

        System.out.println(tipoFuego);
    }
}
