package dosw.taller4_patrones.ejercicio10_imagenes;

/**
 * Decorador base: envuelve una Image (tipada por la interfaz) para
 * aplicar un filtro acumulativo. getWrapped() permite a un Command
 * "desenvolver" el último filtro aplicado, implementando el undo.
 */
public abstract class ImageDecorator implements Image {

    protected final Image imagenEnvuelta;

    protected ImageDecorator(Image imagenEnvuelta) {
        this.imagenEnvuelta = imagenEnvuelta;
    }

    // Devuelve la imagen tal como estaba antes de aplicar este filtro (para deshacer).
    public Image getWrapped() {
        return imagenEnvuelta;
    }
}
