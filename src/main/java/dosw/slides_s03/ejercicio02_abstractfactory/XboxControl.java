package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante Xbox) del control.
public class XboxControl implements Control {
    @Override
    public void conectar() {
        System.out.println("Control Xbox Wireless conectado.");
    }
}
