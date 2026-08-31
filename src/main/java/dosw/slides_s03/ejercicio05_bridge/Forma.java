package dosw.slides_s03.ejercicio05_bridge;

/**
 * Abstracción: capa de control de alto nivel. No pinta nada por sí
 * misma — delega ese trabajo al objeto Color que referencia (el
 * "puente" hacia la jerarquía de implementación).
 */
public abstract class Forma {

    protected final Color color; // referencia al objeto de la otra jerarquía (el puente)

    protected Forma(Color color) {
        this.color = color;
    }

    // Describe la forma, dejando que cada subclase arme su propio texto usando color.aplicar().
    public abstract String describir();
}
