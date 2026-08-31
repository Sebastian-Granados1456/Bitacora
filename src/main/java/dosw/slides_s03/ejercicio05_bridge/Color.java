package dosw.slides_s03.ejercicio05_bridge;

/**
 * Implementación (la "plataforma" del Bridge): declara la interfaz
 * común para todos los colores concretos. Las formas delegan aquí el
 * detalle de "cómo se pinta", en vez de heredar una subclase por
 * combinación forma+color.
 */
public interface Color {
    String aplicar();
}
