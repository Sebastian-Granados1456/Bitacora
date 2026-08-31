package dosw.semana_1.streams;

import java.util.List;

/**
 * Ejercicio 05 — Transacciones Bancarias.
 * Procesar la lista con peek() para ver cada transacción, y anyMatch()
 * para saber si existe al menos una no aprobada (lote inválido).
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Transaction> transacciones = List.of(
                new Transaction("T1", 150.0, true),
                new Transaction("T2", 320.5, true),
                new Transaction("T3", 80.0, false),
                new Transaction("T4", 500.0, true)
        );

        // peek() permite "espiar" cada elemento del stream sin transformarlo
        // (aquí solo se imprime); luego anyMatch() con lambda revisa si
        // alguna transacción tiene approved == false.
        boolean existeNoAprobada = transacciones.stream()
                .peek(System.out::println)
                .anyMatch(t -> !t.isApproved());

        // El lote es válido solo si NO existe ninguna transacción sin aprobar.
        boolean loteValido = !existeNoAprobada;
        System.out.println("¿Lote válido?: " + loteValido);
    }
}
