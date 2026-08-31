package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 04 — Pokémon Alfa. Nivel 1: Entrenador Novato.
 * Encontrar el Pokémon con el nivel más alto del equipo.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        List<PokemonSimple> equipo = List.of(
                new PokemonSimple("Pikachu", "Eléctrico", 45, false),
                new PokemonSimple("Charmander", "Fuego", 62, false),
                new PokemonSimple("Squirtle", "Agua", 38, false),
                new PokemonSimple("Snorlax", "Normal", 90, false),
                new PokemonSimple("Mewtwo", "Psíquico", 88, true)
        );

        // max() con un Comparator que compara por nivel (lambda dentro de
        // comparingInt): recorre el stream y se queda con el de mayor nivel.
        PokemonSimple alfa = equipo.stream()
                .max(Comparator.comparingInt(PokemonSimple::nivel))
                .orElseThrow();

        System.out.println("Pokémon Alfa: " + alfa.nombre() + " (nivel " + alfa.nivel() + ")");
    }
}
