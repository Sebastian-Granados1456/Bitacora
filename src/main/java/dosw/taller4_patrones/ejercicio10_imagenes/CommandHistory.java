package dosw.taller4_patrones.ejercicio10_imagenes;

import java.util.ArrayList;
import java.util.List;

/**
 * Historial de comandos ejecutados. Permite deshacer un comando
 * específico (no solo el último), removiéndolo de la lista y
 * llamando a su undo() — así se cumple el requisito de poder
 * deshacer cada acción de forma individual.
 */
public class CommandHistory {

    private final List<ImageCommand> ejecutados = new ArrayList<>();

    // Ejecuta el comando y lo agrega al historial.
    public void ejecutar(ImageCommand comando) {
        comando.execute();
        ejecutados.add(comando);
    }

    // Deshace el comando en la posición indicada del historial (0 = primero aplicado).
    public void deshacer(int indice) {
        ImageCommand comando = ejecutados.remove(indice);
        comando.undo();
    }

    // Deshace el último comando ejecutado.
    public void deshacerUltimo() {
        if (!ejecutados.isEmpty()) {
            deshacer(ejecutados.size() - 1);
        }
    }
}
