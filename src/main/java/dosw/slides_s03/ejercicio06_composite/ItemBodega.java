package dosw.slides_s03.ejercicio06_composite;

/**
 * Componente común del Composite: tanto un Producto simple (hoja) como
 * una Caja (contenedor) responden a este mismo contrato, así el
 * cliente calcula el precio total sin distinguir cuál es cuál.
 */
public interface ItemBodega {
    double calcularPrecioTotal();
}
