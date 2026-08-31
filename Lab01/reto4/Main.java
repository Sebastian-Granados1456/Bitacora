import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Reto 4 - El Tesoro de las Llaves Duplicadas.
 * Combina un HashMap (Estudiante A) y un Hashtable (Estudiante B) en un
 * único mapa ordenado, resolviendo los conflictos de llave a favor del Hashtable.
 */
public class Main {
    public static void main(String[] args) {
        // HashMap: ante llaves repetidas se conserva el PRIMER valor con
        // putIfAbsent(), que solo inserta si la llave todavía no existe.
        Map<String, Integer> mapaA = new HashMap<>();
        putConservandoPrimero(mapaA, "oro", 5);
        putConservandoPrimero(mapaA, "plata", 3);
        putConservandoPrimero(mapaA, "oro", 7);
        putConservandoPrimero(mapaA, "diamante", 10);

        // Hashtable: estructura sincronizada (segura para múltiples hilos);
        // aquí simplemente se insertan los pares tal como llegan.
        Hashtable<String, Integer> mapaB = new Hashtable<>();
        mapaB.put("plata", 8);
        mapaB.put("rubí", 4);
        mapaB.put("oro", 12);
        mapaB.put("esmeralda", 6);

        Map<String, Integer> combinado = combinar(mapaA, mapaB);

        // stream() + map() + sorted() para imprimir las claves en mayúscula
        // y en orden ascendente, tal como pide el enunciado.
        combinado.entrySet().stream()
                .map(e -> e.getKey().toUpperCase() + "|" + e.getValue())
                .sorted()
                .forEach(par -> {
                    String[] partes = par.split("\\|");
                    System.out.printf("Clave: %-10s| Valor: %d%n", partes[0], Integer.parseInt(partes[1]));
                });
    }

    // Inserta en el mapa solo si la llave no existe todavía, conservando
    // así el primer valor recibido para esa llave (regla del HashMap A).
    private static void putConservandoPrimero(Map<String, Integer> mapa, String clave, int valor) {
        mapa.putIfAbsent(clave, valor);
    }

    // Combina ambos mapas con Collectors.toMap(): recorre las entradas del
    // HashMap y del Hashtable y, si una llave se repite en ambos ("oro"),
    // el merge function (b) se queda con el valor del Hashtable (prioridad B).
    private static Map<String, Integer> combinar(Map<String, Integer> a, Map<String, Integer> b) {
        return java.util.stream.Stream.concat(a.entrySet().stream(), b.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (valorA, valorB) -> valorB));
    }
}
