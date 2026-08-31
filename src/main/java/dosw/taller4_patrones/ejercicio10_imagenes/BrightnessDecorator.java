package dosw.taller4_patrones.ejercicio10_imagenes;

// Filtro concreto: brillo, acumulable sobre cualquier otra imagen/filtro.
public class BrightnessDecorator extends ImageDecorator {

    public BrightnessDecorator(Image imagenEnvuelta) {
        super(imagenEnvuelta);
    }

    @Override
    public String render() {
        return imagenEnvuelta.render() + " + brillo";
    }
}
