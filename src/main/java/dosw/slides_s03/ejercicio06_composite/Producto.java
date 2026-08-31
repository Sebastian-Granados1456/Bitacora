package dosw.slides_s03.ejercicio06_composite;

// Hoja: elemento básico del árbol, sin subelementos.
public class Producto implements ItemBodega {

    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecioTotal() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
