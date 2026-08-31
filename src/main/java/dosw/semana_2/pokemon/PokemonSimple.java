package dosw.semana_2.pokemon;

/**
 * Versión mínima de Pokémon (solo nombre y tipo) usada en los ejercicios
 * del Nivel 1, antes de que el taller pida la clase Pokemon completa
 * (con poderCombate, región, etc.) a partir del Nivel 3.
 */
public record PokemonSimple(String nombre, String tipo, int nivel, boolean puedeEvolucionar) {
}
