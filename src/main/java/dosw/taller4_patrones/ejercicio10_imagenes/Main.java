package dosw.taller4_patrones.ejercicio10_imagenes;

/**
 * TALLER_DOSW_#4 — Ejercicio #10: Aplicación de Edición de Imágenes.
 * Combina Decorator (filtros acumulativos que envuelven la imagen en
 * cualquier orden) con Command (cada operación del usuario es un
 * objeto reversible, permitiendo undo individual vía el historial).
 * Usuario aplica filtro → se crea un ApplyFilterCommand que envuelve
 * la imagen → se agrega al historial → deshacer quita ese wrapper
 * específico y restaura la imagen anterior.
 */
public class Main {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor(new BaseImage("foto.jpg"));
        CommandHistory historial = new CommandHistory();

        ImageCommand aplicarSepia = new ApplyFilterCommand(editor, SepiaDecorator::new);
        ImageCommand aplicarBrillo = new ApplyFilterCommand(editor, BrightnessDecorator::new);
        ImageCommand aplicarGrises = new ApplyFilterCommand(editor, GrayscaleDecorator::new);

        historial.ejecutar(aplicarSepia);
        historial.ejecutar(aplicarBrillo);
        historial.ejecutar(aplicarGrises);
        System.out.println("Después de aplicar 3 filtros: " + editor.getImagenActual().render());

        historial.deshacerUltimo(); // quita blanco_y_negro
        System.out.println("Después de deshacer el último filtro: " + editor.getImagenActual().render());
    }
}
