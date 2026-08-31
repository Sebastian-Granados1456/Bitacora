package dosw.slides_s03.ejercicio02_abstractfactory;

/**
 * El "motor del juego" recibe una ConsolaFactory (sin saber si es
 * PlayStation o Xbox) y usa sus productos a través de las interfaces
 * abstractas — nunca conoce las implementaciones concretas.
 */
public class MotorJuego {

    private final Control control;
    private final Juego juego;
    private final InterfazGrafica interfazGrafica;

    public MotorJuego(ConsolaFactory factory) {
        this.control = factory.crearControl();
        this.juego = factory.crearJuego();
        this.interfazGrafica = factory.crearInterfazGrafica();
    }

    // Ejecuta el flujo típico: conectar control, iniciar juego, renderizar interfaz.
    public void ejecutar() {
        control.conectar();
        juego.iniciar();
        interfazGrafica.renderizar();
    }
}
