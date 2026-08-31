import java.util.List;

/**
 * Reto 1 - La Bienvenida.
 * Punto de entrada: crea la lista con mis datos (bitácora individual) y
 * muestra el mensaje de bienvenida generado con stream/map/collect.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: reemplazar por tus datos reales antes de entregar.
        List<Estudiante> yo = List.of(
                new Estudiante("Juan Pérez", 21, "juan.perez@mail.escuelaing.edu.co", 6)
        );

        System.out.println(MensajeBienvenida.generar(yo));
    }
}
