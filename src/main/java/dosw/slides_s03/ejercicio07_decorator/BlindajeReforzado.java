package dosw.slides_s03.ejercicio07_decorator;

// Decorador concreto: +30 de defensa (según el enunciado).
public class BlindajeReforzado extends ModuloDecorator {

    public BlindajeReforzado(Barco barcoEnvuelto) {
        super(barcoEnvuelto);
    }

    @Override
    public int defensa() {
        return barcoEnvuelto.defensa() + 30;
    }

    @Override
    public String descripcion() {
        return barcoEnvuelto.descripcion() + " + Blindaje reforzado";
    }
}
