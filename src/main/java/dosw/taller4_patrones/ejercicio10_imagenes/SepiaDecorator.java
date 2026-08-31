package dosw.taller4_patrones.ejercicio10_imagenes;

// Filtro concreto: sepia, acumulable sobre cualquier otra imagen/filtro.
public class SepiaDecorator extends ImageDecorator {

    public SepiaDecorator(Image imagenEnvuelta) {
        super(imagenEnvuelta);
    }

    @Override
    public String render() {
        return imagenEnvuelta.render() + " + sepia";
    }
}
