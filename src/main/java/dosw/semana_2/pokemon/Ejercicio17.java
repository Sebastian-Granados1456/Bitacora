package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Entrenador;
import dosw.semana_2.pokemon.model.Pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 17 — Equipo Más Poderoso. Nivel 4: Alto Mando.
 * Calcular qué entrenador tiene la suma total de poderCombate más alta
 * entre todos sus Pokémon.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Entrenador ash = new Entrenador(1L, "Ash", 8, List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 900, "Kanto", false),
                new Pokemon(2L, "Charizard", "Fuego", 60, 950, "Kanto", false)
        ));
        Entrenador gary = new Entrenador(2L, "Gary", 10, List.of(
                new Pokemon(3L, "Blastoise", "Agua", 62, 1200, "Kanto", false),
                new Pokemon(4L, "Eevee", "Normal", 30, 1140, "Kanto", false)
        ));
        Entrenador brock = new Entrenador(3L, "Brock", 6, List.of(
                new Pokemon(5L, "Onix", "Roca", 40, 870, "Kanto", false),
                new Pokemon(6L, "Geodude", "Roca", 25, 800, "Kanto", false)
        ));

        List<Entrenador> entrenadores = List.of(ash, gary, brock);

        // Para cada entrenador se suma el poderCombate de su equipo con
        // mapToDouble().sum(); luego max() con Comparator personalizado
        // (lambda que aplica esa suma) encuentra al más poderoso.
        Entrenador masPoderoso = entrenadores.stream()
                .max(Comparator.comparingDouble(Ejercicio17::poderTotal))
                .orElseThrow();

        System.out.println("Entrenador más poderoso: " + masPoderoso.getNombre());
        System.out.println("Poder acumulado del equipo: " + (int) poderTotal(masPoderoso));
    }

    // Suma el poderCombate de todos los Pokémon del equipo de un entrenador
    // usando mapToDouble() + sum(); se extrae aparte para reutilizarla
    // tanto en el Comparator como al imprimir el resultado.
    private static double poderTotal(Entrenador entrenador) {
        return entrenador.getEquipo().stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .sum();
    }
}
