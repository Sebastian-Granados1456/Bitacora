import java.util.stream.IntStream;

/**
 * Canal A: procesa el mensaje con StringBuilder (rápido, sin sincronización).
 * Se encarga de "amplificar" la señal repitiendo el mensaje 3 veces.
 */
public class CanalA {

    // Repite el mensaje recibido 3 veces separado por espacios. Se usa
    // IntStream.range(0,3) + forEach (sin for tradicional) para recorrer
    // las repeticiones y StringBuilder.append() para ir construyendo el resultado.
    public static String amplificar(String mensaje) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (i > 0) sb.append(" ");
            sb.append(mensaje);
        });
        return sb.toString();
    }
}
