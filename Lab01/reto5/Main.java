import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reto 5 - Batalla de Conjuntos.
 * Combina un HashSet (sin orden, elimina múltiplos de 3) y un TreeSet
 * (ordenado, elimina múltiplos de 5) en una sola arena ordenada sin duplicados.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Set.of(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> treeSet = new TreeSet<>(Set.of(12, 3, 25, 10, 7, 30, 18, 4));

        // stream().filter() con lambda: descarta del HashSet los múltiplos de 3
        // (Estudiante A) y del TreeSet los múltiplos de 5 (Estudiante B).
        Set<Integer> guerrerosA = hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());

        Set<Integer> guerrerosB = treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toSet());

        // Unión de ambos grupos en un TreeSet (elimina duplicados automáticamente
        // y mantiene orden ascendente) y se imprime con forEach + lambda.
        Set<Integer> arena = Stream.concat(guerrerosA.stream(), guerrerosB.stream())
                .collect(Collectors.toCollection(TreeSet::new));

        arena.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
