package dosw.slides_s03.ejercicio02_abstractfactory;

// Producto concreto (variante PlayStation) de la interfaz gráfica.
public class PlayStationInterfazGrafica implements InterfazGrafica {
    @Override
    public void renderizar() {
        System.out.println("Renderizando interfaz PS5 en 4K.");
    }
}
