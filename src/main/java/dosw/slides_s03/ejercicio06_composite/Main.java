package dosw.slides_s03.ejercicio06_composite;

/**
 * Ejercicio #6 — Composite (DOSW 1 - S03.pptx, diapositivas 24-28).
 * Bodega con productos individuales y cajas que pueden contener
 * productos u otras cajas (anidadas). El precio total se calcula
 * recorriendo el árbol sin que el cliente distinga hoja de contenedor.
 */
public class Main {
    public static void main(String[] args) {
        Caja cajaChica = new Caja("Caja chica");
        cajaChica.agregar(new Producto("Cargador", 15.0));
        cajaChica.agregar(new Producto("Cable USB", 5.0));

        Caja cajaGrande = new Caja("Caja grande");
        cajaGrande.agregar(new Producto("Monitor", 250.0));
        cajaGrande.agregar(cajaChica); // caja dentro de caja

        System.out.println(cajaChica.getNombre() + " → $" + cajaChica.calcularPrecioTotal());
        System.out.println(cajaGrande.getNombre() + " → $" + cajaGrande.calcularPrecioTotal());
    }
}
