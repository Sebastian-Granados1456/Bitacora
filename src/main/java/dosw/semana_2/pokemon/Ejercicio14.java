package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 14 — Organizar por Región. Nivel 3: Líder de Gimnasio.
 * Agrupar los Pokémon según su región de origen.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 300, "Kanto", false),
                new Pokemon(2L, "Chikorita", "Planta", 20, 200, "Johto", false),
                new Pokemon(3L, "Torchic", "Fuego", 25, 240, "Hoenn", false),
                new Pokemon(4L, "Piplup", "Agua", 22, 210, "Sinnoh", false),
                new Pokemon(5L, "Charmander", "Fuego", 25, 250, "Kanto", false),
                new Pokemon(6L, "Totodile", "Agua", 21, 205, "Johto", false)
        );

        // groupingBy() sobre getRegion(): mismo patrón que el ejercicio 13,
        // agrupando esta vez por región en lugar de por tipo.
        Map<String, List<String>> porRegion = equipo.stream()
                .collect(Collectors.groupingBy(Pokemon::getRegion,
                        Collectors.mapping(Pokemon::getNombre, Collectors.toList())));

        porRegion.forEach((region, nombres) -> System.out.println(region + ": " + nombres));
    }
}
