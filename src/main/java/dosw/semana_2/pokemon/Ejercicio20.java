package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 20 — Pokédex Analítica. Nivel 5: Campeón de la Liga.
 * Construye un resumen completo usando solo Streams: cantidad por tipo,
 * por región, cantidad de legendarios, promedio de nivel y el más fuerte.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Johto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 50, 495, "Johto", false),
                new Pokemon(6L, "Charizard", "Fuego", 60, 610, "Kanto", false),
                new Pokemon(7L, "Mew", "Psíquico", 85, 650, "Johto", true)
        );

        // groupingBy() + counting(): agrupa por tipo y por región contando
        // cuántos Pokémon caen en cada grupo, todo con Streams.
        Map<String, Long> porTipo = pokedex.stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));

        Map<String, Long> porRegion = pokedex.stream()
                .collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));

        // filter() + count() para legendarios; mapToInt() + average() para
        // el promedio de nivel; max() con Comparator para el más fuerte.
        long legendarios = pokedex.stream()
                .filter(Pokemon::isLegendario)
                .count();

        double promedioNivel = pokedex.stream()
                .mapToInt(Pokemon::getNivel)
                .average()
                .orElse(0);

        Pokemon masFuerte = pokedex.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .orElseThrow();

        System.out.println("Por tipo:     " + porTipo);
        System.out.println("Por región:   " + porRegion);
        System.out.println("Legendarios:  " + legendarios);
        System.out.printf("Promedio niv: %.1f%n", promedioNivel);
        System.out.println("Más fuerte:   " + masFuerte.getNombre() + " (PC: " + (int) masFuerte.getPoderCombate() + ")");
    }
}
