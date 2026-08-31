package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 15 — Maestro de Gimnasios. Nivel 4: Alto Mando.
 * Dado un listado de entrenadores con sus medallas, encontrar quien
 * tiene más medallas.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        List<EntrenadorSimple> entrenadores = List.of(
                new EntrenadorSimple("Ash", 8),
                new EntrenadorSimple("Misty", 5),
                new EntrenadorSimple("Brock", 6),
                new EntrenadorSimple("Gary", 10)
        );

        // max() con Comparator.comparingInt sobre medallas: recorre el
        // stream y se queda con el entrenador de más medallas.
        EntrenadorSimple campeon = entrenadores.stream()
                .max(Comparator.comparingInt(EntrenadorSimple::medallas))
                .orElseThrow();

        System.out.println("Campeón de gimnasios: " + campeon.nombre());
        System.out.println("Medallas obtenidas: " + campeon.medallas());
    }
}
