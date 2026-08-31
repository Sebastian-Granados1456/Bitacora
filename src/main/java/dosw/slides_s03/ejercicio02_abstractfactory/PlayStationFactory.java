package dosw.slides_s03.ejercicio02_abstractfactory;

// Fábrica concreta: crea la familia completa de componentes PlayStation.
public class PlayStationFactory implements ConsolaFactory {
    @Override
    public Control crearControl() {
        return new PlayStationControl();
    }

    @Override
    public Juego crearJuego() {
        return new PlayStationJuego();
    }

    @Override
    public InterfazGrafica crearInterfazGrafica() {
        return new PlayStationInterfazGrafica();
    }
}
