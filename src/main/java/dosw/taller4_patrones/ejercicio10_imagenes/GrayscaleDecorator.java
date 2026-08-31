package dosw.taller4_patrones.ejercicio10_imagenes;

// Filtro concreto: blanco y negro, acumulable sobre cualquier otra imagen/filtro.
public class GrayscaleDecorator extends ImageDecorator {

    public GrayscaleDecorator(Image imagenEnvuelta) {
        super(imagenEnvuelta);
    }

    @Override
    public String render() {
        return imagenEnvuelta.render() + " + blanco_y_negro";
    }
}
