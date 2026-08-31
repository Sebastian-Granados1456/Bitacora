package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.List;

/**
 * Ejercicio 10 — Pokédex Compacta. Nivel 3: Líder de Gimnasio.
 * Generar una lista con solo los nombres de todos los Pokémon del equipo.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 50, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 60, 610, "Kanto", false)
        );

        // map() con method reference extrae solo el nombre de cada Pokemon,
        // y collect()/toList() arma la lista compacta final.
        List<String> pokedexCompacta = equipo.stream()
                .map(Pokemon::getNombre)
                .toList();

        System.out.println(pokedexCompacta);
    }
}
