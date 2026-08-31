package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante Xbox) del juego.
public class XboxJuego implements Juego {
    @Override
    public void iniciar() {
        System.out.println("Juego iniciado en formato Xbox Series X (Game Pass/disco).");
    }
}
