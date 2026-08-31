import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Une el Canal A y el Canal B en una sola función de descifrado: primero
 * amplifica (CanalA) y luego invierte (CanalB) el mensaje recibido.
 */
public class Descifrador {

    // Función combinada expresada como lambda: recibe un mensaje, lo amplifica
    // con CanalA y el resultado lo invierte con CanalB. Se usa vía función
    // Function<String, String> para poder invocarla con .apply(mensaje).
    public static final Function<String, String> DESCIFRAR = mensaje -> CanalB.invertir(CanalA.amplificar(mensaje));

    // Procesa una lista de mensajes con stream().map(), aplicando la lambda
    // DESCIFRAR a cada uno y devolviendo la lista de resultados ya descifrados.
    public static List<String> descifrarTodos(List<String> mensajes) {
        return mensajes.stream()
                .map(DESCIFRAR)
                .collect(Collectors.toList());
    }
}
