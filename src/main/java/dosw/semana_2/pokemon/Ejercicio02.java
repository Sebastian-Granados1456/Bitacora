package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 02 — Pokédex Gritona. Nivel 1: Entrenador Novato.
 * Transformar todos los nombres de Pokémon a mayúsculas.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur");

        // map() con method reference: transforma cada nombre a mayúscula
        // sin necesidad de escribir la lambda explícita n -> n.toUpperCase().
        List<String> pokedexGritona = nombres.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(pokedexGritona);
    }
}
