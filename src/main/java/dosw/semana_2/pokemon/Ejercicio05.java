package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 05 — Pokémon Legendarios. Nivel 1: Entrenador Novato.
 * Contar cuántos Pokémon del equipo tienen nivel superior a 80.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        List<PokemonSimple> equipo = List.of(
                new PokemonSimple("Pikachu", "Eléctrico", 45, false),
                new PokemonSimple("Mewtwo", "Psíquico", 88, true),
                new PokemonSimple("Dragonite", "Dragón", 82, false),
                new PokemonSimple("Squirtle", "Agua", 38, false),
                new PokemonSimple("Mew", "Psíquico", 85, true),
                new PokemonSimple("Charmander", "Fuego", 62, false)
        );

        // filter() se queda con los que tienen nivel > 80, y count() cuenta
        // cuántos quedaron sin necesidad de acumular manualmente.
        List<PokemonSimple> masFuertes = equipo.stream()
                .filter(p -> p.nivel() > 80)
                .toList();

        long cantidad = masFuertes.size();
        String nombres = masFuertes.stream()
                .map(PokemonSimple::nombre)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

        System.out.println("Pokémon con nivel > 80: " + cantidad);
        System.out.println("(" + nombres + ")");
    }
}
