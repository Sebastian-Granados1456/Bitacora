package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 01 — Números Pares mayores a diez.
 * Fuente: "DOSW 1 - S02.pptx" (Ejercicios de repaso #1).
 * Dada una lista de enteros, obtener una nueva lista solo con los números
 * pares mayores a 10.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 8, 10, 12, 15, 18, 20);

        // filter() con lambda: se queda solo con los números que cumplen
        // ambas condiciones (par y mayor a 10); collect() arma la lista final.
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
