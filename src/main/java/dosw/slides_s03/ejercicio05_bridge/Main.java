package dosw.slides_s03.ejercicio05_bridge;

/**
 * Ejercicio #5 — Bridge (DOSW 1 - S03.pptx, diapositivas 20-23).
 * Formas geométricas + colores: sin Bridge, agregar colores a
 * Círculo/Cuadrado obligaría a crear una subclase por combinación
 * (CirculoRojo, CirculoAzul, CuadradoRojo...). Con Bridge, la
 * dimensión "color" se extrae a su propia jerarquía y las formas solo
 * la referencian.
 */
public class Main {
    public static void main(String[] args) {
        Forma circuloRojo = new Circulo(new Rojo());
        Forma cuadradoAzul = new Cuadrado(new Azul());
        Forma circuloAzul = new Circulo(new Azul());

        System.out.println(circuloRojo.describir());
        System.out.println(cuadradoAzul.describir());
        System.out.println(circuloAzul.describir());
    }
}
