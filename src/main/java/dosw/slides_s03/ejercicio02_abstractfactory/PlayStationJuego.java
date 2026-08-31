package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante PlayStation) del juego.
public class PlayStationJuego implements Juego {
    @Override
    public void iniciar() {
        System.out.println("Juego iniciado en formato PS5 (Blu-ray/digital).");
    }
}
