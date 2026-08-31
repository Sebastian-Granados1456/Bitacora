package dosw.slides_s03.ejercicio03_builder;

/**
 * Producto final e inmutable. Solo se construye mediante MunecoBuilder
 * (constructor package-private) para garantizar que siempre queda
 * completo antes de existir — evita un constructor con 5+ parámetros.
 */
public class Muneco {

    private final String cabeza;
    private final String cuerpo;
    private final String brazos;
    private final String piernas;
    private final String accesorio; // puede ser null: no todos llevan accesorio

    Muneco(String cabeza, String cuerpo, String brazos, String piernas, String accesorio) {
        this.cabeza = cabeza;
        this.cuerpo = cuerpo;
        this.brazos = brazos;
        this.piernas = piernas;
        this.accesorio = accesorio;
    }

    @Override
    public String toString() {
        String base = "Muñeco[cabeza=" + cabeza + ", cuerpo=" + cuerpo
                + ", brazos=" + brazos + ", piernas=" + piernas + "]";
        return accesorio == null ? base : base + " + accesorio: " + accesorio;
    }
}
