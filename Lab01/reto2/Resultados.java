/**
 * Guarda el resumen de una lista de números procesada en la carrera:
 * el mayor, el menor, la cantidad de datos y las verificaciones pedidas
 * (si el mayor es múltiplo/divisible de 2, si la cantidad es par).
 */
public record Resultados(int mayor, int menor, int cantidad,
                          boolean mayorMultiploDe2, boolean mayorDivisibleEntre2,
                          boolean cantidadPar) {
}
