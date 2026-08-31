package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 03 — Poder Total del Equipo. Nivel 1: Entrenador Novato.
 * Dada una lista de niveles, calcular la suma total con reduce().
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);

        // reduce() combina todos los elementos del stream en un solo valor:
        // arranca en 0 y va sumando cada nivel con la lambda (a, b) -> a + b.
        int sumaTotal = niveles.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Suma total de niveles: " + sumaTotal);
    }
}
