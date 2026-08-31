import java.util.List;
import java.util.stream.Collectors;

/**
 * Construye el mensaje de bienvenida a partir de una lista de Estudiante,
 * usando Programación Funcional (stream + map + collect).
 */
public class MensajeBienvenida {

    // Convierte cada Estudiante en un fragmento de texto ("Nombre, de N° semestre de E años")
    // usando una expresión lambda dentro de map(), y luego une los fragmentos con collect()
    // en un único String separado por " y ". Así se arma la parte central del saludo.
    public static String generar(List<Estudiante> estudiantes) {
        String presentacion = estudiantes.stream()
                .map(e -> e.nombre() + ", de " + e.semestre() + "° semestre de " + e.edad() + " años")
                .collect(Collectors.joining(" y "));

        // stream + map + collect también para los correos: se transforma cada Estudiante
        // en su correo y se unen con " y " para la última línea del mensaje.
        String correos = estudiantes.stream()
                .map(Estudiante::correo)
                .collect(Collectors.joining(" y "));

        return "¡Hola, bienvenidos! Soy " + presentacion + ". Mi correo es: " + correos + ".";
    }
}
