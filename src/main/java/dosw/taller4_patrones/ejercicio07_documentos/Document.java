package dosw.taller4_patrones.ejercicio07_documentos;

/**
 * El documento nunca sabe en qué estado está ni tiene un switch de
 * estados — delega approve()/reject() al objeto DocumentState actual,
 * que decide a qué estado transicionar (patrón State).
 */
public class Document {

    private final String nombre;
    private DocumentState estado = new DraftState();

    public Document(String nombre) {
        this.nombre = nombre;
    }

    // Cambia el estado actual del documento (lo invocan los propios DocumentState).
    void setEstado(DocumentState estado) {
        this.estado = estado;
    }

    // Delega la aprobación al estado actual, que decide la transición.
    public void approve() {
        estado.approve(this);
    }

    // Delega el rechazo al estado actual, que decide la transición.
    public void reject() {
        estado.reject(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoActual() {
        return estado.nombre();
    }
}
