package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 13 — Organizar por Tipo. Nivel 3: Líder de Gimnasio.
 * Agrupar todos los Pokémon por su tipo y mostrar el listado por grupo.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(2L, "Psyduck", "Agua", 15, 180, "Kanto", false),
                new Pokemon(3L, "Charmander", "Fuego", 25, 250, "Kanto", false),
                new Pokemon(4L, "Vulpix", "Fuego", 18, 190, "Kanto", false),
                new Pokemon(5L, "Bulbasaur", "Planta", 22, 220, "Kanto", false)
        );

        // groupingBy() con method reference agrupa los Pokémon según el
        // valor devuelto por getTipo(), armando un Map<tipo, listaDePokemon>.
        Map<String, List<String>> porTipo = equipo.stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo,
                        Collectors.mapping(Pokemon::getNombre, Collectors.toList())));

        porTipo.forEach((tipo, nombres) -> System.out.println(tipo + ": " + nombres));
    }
}
