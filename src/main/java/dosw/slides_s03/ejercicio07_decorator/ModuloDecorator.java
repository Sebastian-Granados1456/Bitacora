package dosw.slides_s03.ejercicio07_decorator;

/**
 * Decorador base: envuelve un Barco (campo tipado como la interfaz
 * Barco, no como una clase concreta) y por defecto delega todas las
 * operaciones al objeto envuelto. Los decoradores concretos solo
 * sobreescriben lo que necesitan alterar.
 */
public abstract class ModuloDecorator implements Barco {

    protected final Barco barcoEnvuelto;

    protected ModuloDecorator(Barco barcoEnvuelto) {
        this.barcoEnvuelto = barcoEnvuelto;
    }

    @Override
    public int ataque() {
        return barcoEnvuelto.ataque();
    }

    @Override
    public int defensa() {
        return barcoEnvuelto.defensa();
    }

    @Override
    public String descripcion() {
        return barcoEnvuelto.descripcion();
    }
}
