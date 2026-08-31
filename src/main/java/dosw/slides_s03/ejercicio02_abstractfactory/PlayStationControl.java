package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante PlayStation) del control.
public class PlayStationControl implements Control {
    @Override
    public void conectar() {
        System.out.println("Control DualSense conectado por Bluetooth.");
    }
}
