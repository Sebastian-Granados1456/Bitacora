package dosw.slides_s03.ejercicio07_decorator;

// Decorador concreto: +20 de ataque (según el enunciado, aunque el nombre sugiera defensa).
public class SistemaAntitorpedos extends ModuloDecorator {

    public SistemaAntitorpedos(Barco barcoEnvuelto) {
        super(barcoEnvuelto);
    }

    @Override
    public int ataque() {
        return barcoEnvuelto.ataque() + 20;
    }

    @Override
    public String descripcion() {
        return barcoEnvuelto.descripcion() + " + Sistema antitorpedos";
    }
}
