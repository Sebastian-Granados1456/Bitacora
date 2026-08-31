import java.util.List;

/**
 * Funciones para procesar una lista de números: cada método usa una
 * expresión lambda para resolver su parte y al final se combinan todas
 * en un único Resultados.
 */
public class CarreraUtils {

    // Recorre la lista con stream().min() y una lambda comparadora para
    // quedarse con el valor más pequeño.
    public static int menor(List<Integer> datos) {
        return datos.stream().min((a, b) -> a - b).orElseThrow();
    }

    // Cantidad de datos ingresados, usando stream().count().
    public static long cantidad(List<Integer> datos) {
        return datos.stream().count();
    }

    // stream().max() con lambda comparadora para obtener el valor más
    // grande de la lista.
    public static int mayor(List<Integer> datos) {
        return datos.stream().max((a, b) -> a - b).orElseThrow();
    }

    // Verifica si un número es múltiplo de 2 (resto de la división == 0).
    // Lambda equivalente a n -> n % 2 == 0, aquí expresada como método reusable.
    public static boolean esMultiploDe2(int n) {
        return n % 2 == 0;
    }

    // Combina mayor, menor y cantidad de una lista en un solo objeto
    // Resultados, aplicando las verificaciones de múltiplo/par pedidas.
    public static Resultados combinar(List<Integer> datos) {
        int max = mayor(datos);
        int min = menor(datos);
        long total = cantidad(datos);
        return new Resultados(max, min, (int) total,
                esMultiploDe2(max), esMultiploDe2(max), total % 2 == 0);
    }
}
