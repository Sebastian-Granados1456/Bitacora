package dosw.semana_2.pokemon;

import dosw.semana_2.pokemon.model.Entrenador;
import dosw.semana_2.pokemon.model.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Ejercicio 19 — Top 3 Entrenadores. Nivel 5: Campeón de la Liga.
 * Ranking de los 3 mejores entrenadores: 1° más medallas, 2° mayor poder
 * acumulado, 3° orden alfabético como desempate.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Entrenador gary = new Entrenador(1L, "Gary", 10, List.of(
                new Pokemon(1L, "Blastoise", "Agua", 62, 1200, "Kanto", false),
                new Pokemon(2L, "Eevee", "Normal", 30, 1140, "Kanto", false)
        ));
        Entrenador ash = new Entrenador(2L, "Ash", 8, List.of(
                new Pokemon(3L, "Pikachu", "Eléctrico", 45, 900, "Kanto", false),
                new Pokemon(4L, "Charizard", "Fuego", 60, 950, "Kanto", false)
        ));
        Entrenador dawn = new Entrenador(3L, "Dawn", 7, List.of(
                new Pokemon(5L, "Piplup", "Agua", 40, 1050, "Sinnoh", false),
                new Pokemon(6L, "Buneary", "Normal", 35, 1050, "Sinnoh", false)
        ));
        Entrenador brock = new Entrenador(4L, "Brock", 6, List.of(
                new Pokemon(7L, "Onix", "Roca", 40, 870, "Kanto", false),
                new Pokemon(8L, "Geodude", "Roca", 25, 800, "Kanto", false)
        ));

        List<Entrenador> entrenadores = List.of(gary, ash, dawn, brock);

        // Comparator encadenado con thenComparing(): primero medallas
        // (descendente), luego poder acumulado (descendente) y por último
        // el nombre (ascendente) como desempate final.
        Comparator<Entrenador> porRanking = Comparator
                .comparingInt(Entrenador::getMedallas).reversed()
                .thenComparing(Comparator.comparingDouble(Ejercicio19::poderTotal).reversed())
                .thenComparing(Entrenador::getNombre);

        List<Entrenador> top3 = entrenadores.stream()
                .sorted(porRanking)
                .limit(3)
                .toList();

        // IntStream.range() genera los índices 0..2 para mostrar el puesto
        // (#1, #2, #3) junto a cada entrenador del top 3, sin usar for.
        IntStream.range(0, top3.size())
                .forEach(i -> {
                    Entrenador e = top3.get(i);
                    System.out.println("#" + (i + 1) + " " + e.getNombre() + " – " + e.getMedallas()
                            + " medallas, PC: " + (int) poderTotal(e));
                });
    }

    // Suma el poderCombate del equipo de un entrenador; se reutiliza tanto
    // en el criterio de orden como al imprimir el resultado del ranking.
    private static double poderTotal(Entrenador entrenador) {
        return entrenador.getEquipo().stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .sum();
    }
}
