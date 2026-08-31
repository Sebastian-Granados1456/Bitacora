package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 02 — Cantidad de Palabras con más de 4 caracteres.
 * Fuente: "DOSW 1 - S02.pptx" (Ejercicios de repaso #2).
 * Filtrar palabras de más de 4 caracteres, pasarlas a mayúsculas,
 * ordenarlas alfabéticamente y contar cuántas quedan.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api", "functional", "code", "git");

        // filter() descarta palabras cortas, map() las pasa a mayúsculas y
        // sorted() las ordena alfabéticamente; toList() arma el resultado final.
        List<String> resultado = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        // count() sobre el stream original para obtener la cantidad total
        // de palabras que cumplieron el filtro.
        long cantidad = words.stream()
                .filter(w -> w.length() > 4)
                .count();

        System.out.println(resultado);
        System.out.println("Cantidad de palabras resultantes: " + cantidad);
    }
}
