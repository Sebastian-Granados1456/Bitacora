package dosw.taller4_patrones.ejercicio10_imagenes;

// Imagen original, sin filtros. Nunca cambia — los filtros solo la envuelven.
public class BaseImage implements Image {

    private final String nombreArchivo;

    public BaseImage(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String render() {
        return nombreArchivo;
    }
}
