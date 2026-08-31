package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante Xbox) de la interfaz gráfica.
public class XboxInterfazGrafica implements InterfazGrafica {
    @Override
    public void renderizar() {
        System.out.println("Renderizando interfaz Xbox en 4K con Auto HDR.");
    }
}
