package dosw.slides_s03.ejercicio07_decorator;

// Componente concreto: barco con sus capacidades básicas, sin módulos.
public class BarcoBase implements Barco {

    private final String tipo;
    private final int ataqueBase;
    private final int defensaBase;

    public BarcoBase(String tipo, int ataqueBase, int defensaBase) {
        this.tipo = tipo;
        this.ataqueBase = ataqueBase;
        this.defensaBase = defensaBase;
    }

    @Override
    public int ataque() {
        return ataqueBase;
    }

    @Override
    public int defensa() {
        return defensaBase;
    }

    @Override
    public String descripcion() {
        return tipo;
    }
}
