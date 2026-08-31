package dosw.slides_s03.ejercicio07_decorator;

// Decorador concreto: +40 de ataque (según el enunciado).
public class Misiles extends ModuloDecorator {

    public Misiles(Barco barcoEnvuelto) {
        super(barcoEnvuelto);
    }

    @Override
    public int ataque() {
        return barcoEnvuelto.ataque() + 40;
    }

    @Override
    public String descripcion() {
        return barcoEnvuelto.descripcion() + " + Misiles";
    }
}
