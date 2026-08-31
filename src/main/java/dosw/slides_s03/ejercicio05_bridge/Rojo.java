package dosw.slides_s03.ejercicio05_bridge;

// Implementación concreta del color rojo.
public class Rojo implements Color {
    @Override
    public String aplicar() {
        return "rojo";
    }
}
