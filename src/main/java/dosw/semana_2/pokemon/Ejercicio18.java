package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Ejercicio 18 — Top 5 Pokémon Más Fuertes. Nivel 5: Campeón de la Liga.
 * Ranking de los 5 Pokémon con mayor poderCombate de toda la Pokédex.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 50, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 60, 610, "Kanto", false)
        );

        // sorted() en orden descendente por poderCombate (Comparator.reversed())
        // y limit(5) se queda solo con los 5 primeros del ranking.
        List<Pokemon> top5 = pokedex.stream()
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .limit(5)
                .toList();

        // IntStream.range() genera los índices 0..4 para poder mostrar el
        // puesto (#1, #2, ...) junto a cada Pokémon del top 5, sin usar for.
        IntStream.range(0, top5.size())
                .forEach(i -> System.out.println("#" + (i + 1) + " " + top5.get(i).getNombre()
                        + " – PC: " + (int) top5.get(i).getPoderCombate()));
    }
}
