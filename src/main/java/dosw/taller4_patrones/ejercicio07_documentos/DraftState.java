package dosw.taller4_patrones.ejercicio07_documentos;

// Estado inicial: borrador. Al aprobarlo pasa a "en revisión" (aún no está aprobado del todo).
public class DraftState implements DocumentState {
    @Override
    public void approve(Document doc) {
        doc.setEstado(new InReviewState());
    }

    @Override
    public void reject(Document doc) {
        doc.setEstado(new RejectedState());
    }

    @Override
    public String nombre() {
        return "Borrador";
    }
}
