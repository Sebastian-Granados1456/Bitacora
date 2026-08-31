package dosw.slides_s03.ejercicio03_builder;

/**
 * Builder: construye un Muneco paso a paso mediante métodos encadenables
 * (fluent API). El accesorio es opcional (queda en null si no se llama
 * addAccesorio()). build() arma la instancia inmutable final.
 */
public class MunecoBuilder {

    private String cabeza;
    private String cuerpo;
    private String brazos;
    private String piernas;
    private String accesorio;

    public MunecoBuilder setCabeza(String cabeza) {
        this.cabeza = cabeza;
        return this;
    }

    public MunecoBuilder setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    public MunecoBuilder setBrazos(String brazos) {
        this.brazos = brazos;
        return this;
    }

    public MunecoBuilder setPiernas(String piernas) {
        this.piernas = piernas;
        return this;
    }

    public MunecoBuilder addAccesorio(String accesorio) {
        this.accesorio = accesorio;
        return this;
    }

    // Ensambla el Muneco final con los pasos configurados hasta el momento.
    public Muneco build() {
        return new Muneco(cabeza, cuerpo, brazos, piernas, accesorio);
    }
}
