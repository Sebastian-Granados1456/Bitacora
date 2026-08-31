package dosw.taller4_patrones.ejercicio10_imagenes;

// Receptor: mantiene la imagen actual (con todos los filtros aplicados hasta el momento).
public class PhotoEditor {

    private Image imagenActual;

    public PhotoEditor(Image imagenInicial) {
        this.imagenActual = imagenInicial;
    }

    public Image getImagenActual() {
        return imagenActual;
    }

    // Reemplaza la imagen actual (la usan los comandos al aplicar o deshacer un filtro).
    public void setImagenActual(Image imagenActual) {
        this.imagenActual = imagenActual;
    }
}
