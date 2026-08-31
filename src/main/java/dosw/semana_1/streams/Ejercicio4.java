package dosw.semana_1.streams;

import java.util.List;

/**
 * Ejercicio 04 — Personas mayores de edad.
 * Fuente: "DOSW 1 - S02.pptx" (Ejercicios de repaso #4).
 * Con los mismos atributos de Usuario, filtrar los mayores de edad (18+)
 * y obtener solo sus nombres.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Usuario> users = List.of(
                new Usuario(1, "Carlos", 25, true),
                new Usuario(2, "Ana", 19, false),
                new Usuario(3, "Beatriz", 16, true),
                new Usuario(4, "David", 22, true)
        );

        // filter() con lambda para quedarse solo con age >= 18, y map()
        // para transformar cada Usuario sobreviviente en su nombre.
        List<String> mayoresDeEdad = users.stream()
                .filter(u -> u.age() >= 18)
                .map(Usuario::name)
                .toList();

        System.out.println(mayoresDeEdad);
    }
}
