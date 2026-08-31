package dosw.semana_1.streams;

import java.util.List;

/**
 * Ejercicio 03 — Obtener nombres de los Usuarios.
 * Fuente: "DOSW 1 - S02.pptx" (Ejercicios de repaso #3).
 * Filtrar solo los usuarios activos, obtener sus nombres en mayúscula y
 * ordenarlos alfabéticamente.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<Usuario> users = List.of(
                new Usuario(1, "Carlos", 25, true),
                new Usuario(2, "Ana", 19, false),
                new Usuario(3, "Beatriz", 30, true),
                new Usuario(4, "David", 22, true)
        );

        // filter() se queda solo con los activos, map() extrae el nombre en
        // mayúscula, y sorted() ordena alfabéticamente el resultado final.
        List<String> sortedUsers = users.stream()
                .filter(Usuario::active)
                .map(u -> u.name().toUpperCase())
                .sorted()
                .toList();

        System.out.println(sortedUsers);
    }
}
