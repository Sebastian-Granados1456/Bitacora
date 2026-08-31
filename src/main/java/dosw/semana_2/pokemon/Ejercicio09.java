package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.List;

/**
 * Ejercicio 09 — Equipo Élite. Nivel 3: Líder de Gimnasio.
 * Mostrar solo los Pokémon con poderCombate mayor a 500.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 50, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 60, 610, "Kanto", false)
        );

        // filter() con lambda sobre poderCombate: se queda solo con los
        // que superan 500, y sorted() (descendente) ordena el equipo élite.
        List<Pokemon> equipoElite = equipo.stream()
                .filter(p -> p.getPoderCombate() > 500)
                .sorted((a, b) -> Double.compare(b.getPoderCombate(), a.getPoderCombate()))
                .toList();

        System.out.println("Equipo Élite (PC > 500):");
        System.out.println(equipoElite);
    }
}
