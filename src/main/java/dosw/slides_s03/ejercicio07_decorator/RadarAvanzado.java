package dosw.slides_s03.ejercicio07_decorator;

// Decorador concreto: +10 de ataque (según el enunciado).
public class RadarAvanzado extends ModuloDecorator {

    public RadarAvanzado(Barco barcoEnvuelto) {
        super(barcoEnvuelto);
    }

    @Override
    public int ataque() {
        return barcoEnvuelto.ataque() + 10;
    }

    @Override
    public String descripcion() {
        return barcoEnvuelto.descripcion() + " + Radar avanzado";
    }
}
