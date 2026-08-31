package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 12 — Campeón Regional. Nivel 3: Líder de Gimnasio.
 * Obtener el Pokémon con mayor poderCombate de toda la lista.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Charizard", "Fuego", 60, 610, "Kanto", false)
        );

        // max() con Comparator.comparingDouble sobre poderCombate: recorre
        // el stream y se queda con el ejemplar de mayor poder.
        Pokemon campeon = equipo.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .orElseThrow();

        System.out.println("Campeón: " + campeon.getNombre() + " con PC: " + (int) campeon.getPoderCombate());
    }
}
