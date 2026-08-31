package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.List;

/**
 * Ejercicio 11 — Poder Promedio. Nivel 3: Líder de Gimnasio.
 * Calcular el promedio de poderCombate de todos los Pokémon del equipo.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 50, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 60, 610, "Kanto", false)
        );

        // mapToDouble() convierte el stream de Pokemon a un DoubleStream con
        // el poderCombate de cada uno, y average() calcula el promedio.
        double promedio = equipo.stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .average()
                .orElse(0);

        System.out.printf("Poder de combate promedio: %.2f%n", promedio);
    }
}
