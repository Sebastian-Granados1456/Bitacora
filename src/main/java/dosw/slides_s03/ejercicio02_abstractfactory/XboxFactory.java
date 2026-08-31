package dosw.slides_s03.ejercicio02_abstractfactory;

// Fábrica concreta: crea la familia completa de componentes Xbox.
public class XboxFactory implements ConsolaFactory {
    @Override
    public Control crearControl() {
        return new XboxControl();
    }

    @Override
    public Juego crearJuego() {
        return new XboxJuego();
    }

    @Override
    public InterfazGrafica crearInterfazGrafica() {
        return new XboxInterfazGrafica();
    }
}
