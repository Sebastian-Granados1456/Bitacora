package dosw.taller4_patrones.ejercicio10_imagenes;

import java.util.function.Function;

/**
 * Command concreto: aplica un filtro (Decorator) sobre la imagen
 * actual del editor. execute() envuelve la imagen con el filtro;
 * undo() la desenvuelve con getWrapped() — cada comando recuerda
 * exactamente qué envolvió, permitiendo deshacer un filtro específico
 * sin afectar los demás.
 */
public class ApplyFilterCommand implements ImageCommand {

    private final PhotoEditor editor;
    private final Function<Image, ImageDecorator> filtro;
    private Image imagenAntesDelFiltro;

    public ApplyFilterCommand(PhotoEditor editor, Function<Image, ImageDecorator> filtro) {
        this.editor = editor;
        this.filtro = filtro;
    }

    @Override
    public void execute() {
        imagenAntesDelFiltro = editor.getImagenActual();
        editor.setImagenActual(filtro.apply(imagenAntesDelFiltro));
    }

    @Override
    public void undo() {
        editor.setImagenActual(imagenAntesDelFiltro);
    }
}
