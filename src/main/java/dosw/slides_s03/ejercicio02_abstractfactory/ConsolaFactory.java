package dosw.slides_s03.ejercicio02_abstractfactory;

/**
 * Abstract Factory: declara un método de creación por cada producto
 * de la familia (control, juego, interfaz gráfica). Cada fábrica
 * concreta (PlayStation/Xbox) garantiza que los 3 productos que crea
 * son compatibles entre sí (misma consola).
 */
public interface ConsolaFactory {
    Control crearControl();
    Juego crearJuego();
    InterfazGrafica crearInterfazGrafica();
}
