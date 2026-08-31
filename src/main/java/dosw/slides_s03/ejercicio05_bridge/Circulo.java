package dosw.slides_s03.ejercicio05_bridge;

// Abstracción refinada: forma concreta que usa el color inyectado.
public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public String describir() {
        return "Círculo " + color.aplicar();
    }
}
