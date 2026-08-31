package dosw.slides_s03.ejercicio06_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenedor: puede tener Productos y/u otras Cajas dentro. No conoce
 * las clases concretas de sus hijos, solo el contrato ItemBodega; por
 * eso el cálculo funciona igual sin importar cuántos niveles de
 * anidación existan (recursión: cada hijo resuelve su propio total).
 */
public class Caja implements ItemBodega {

    private final String nombre;
    private final List<ItemBodega> contenido = new ArrayList<>();

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    // Agrega un producto u otra caja al contenido de esta caja.
    public void agregar(ItemBodega item) {
        contenido.add(item);
    }

    @Override
    public double calcularPrecioTotal() {
        // stream + reduce recorre cada item delegando el cálculo (producto u otra caja)
        // y suma el resultado sin importar la profundidad del anidamiento.
        return contenido.stream()
                .mapToDouble(ItemBodega::calcularPrecioTotal)
                .sum();
    }

    public String getNombre() {
        return nombre;
    }
}
