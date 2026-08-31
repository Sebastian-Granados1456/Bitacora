package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 07 — Orden del Profesor Oak. Nivel 2: Entrenador Intermedio.
 * Ordenar alfabéticamente los nombres de los Pokémon.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Squirtle", "Pikachu", "Mewtwo",
                "Bulbasaur", "Charmander", "Abra");

        // sorted() usa el orden natural de String (alfabético) para
        // reordenar el stream sin tocar la lista original.
        List<String> ordenados = nombres.stream()
                .sorted()
                .toList();

        System.out.println(ordenados);
    }
}
