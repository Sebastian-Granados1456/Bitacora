package dosw.slides_s03.ejercicio05_bridge;

// Abstracción refinada: forma concreta que usa el color inyectado.
public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public String describir() {
        return "Cuadrado " + color.aplicar();
    }
}
