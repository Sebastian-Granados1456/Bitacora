package dosw.slides_s03.ejercicio02_abstractfactory;

/**
 * Ejercicio #2 — Abstract Factory (DOSW 1 - S03.pptx, diapositivas 8-11).
 * Videojuegos multiconsola: el motor del juego trabaja con familias
 * completas de componentes (control, juego, interfaz) sin conocer si
 * la consola es PlayStation o Xbox.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejecutando en PlayStation ---");
        MotorJuego motorPs = new MotorJuego(new PlayStationFactory());
        motorPs.ejecutar();

        System.out.println("--- Ejecutando en Xbox ---");
        MotorJuego motorXbox = new MotorJuego(new XboxFactory());
        motorXbox.ejecutar();
    }
}
