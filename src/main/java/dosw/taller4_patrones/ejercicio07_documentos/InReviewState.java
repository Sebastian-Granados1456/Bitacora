package dosw.taller4_patrones.ejercicio07_documentos;

// Estado intermedio: en revisión (la cadena de handlers ya lo movió aquí desde Borrador).
public class InReviewState implements DocumentState {
    @Override
    public void approve(Document doc) {
        doc.setEstado(new ApprovedState());
    }

    @Override
    public void reject(Document doc) {
        doc.setEstado(new RejectedState());
    }

    @Override
    public String nombre() {
        return "En revisión";
    }
}
