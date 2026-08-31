package dosw.taller4_patrones.ejercicio07_documentos;

// Handler concreto: revisión del líder. Solo actúa mientras el documento está en revisión.
public class LiderHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return doc.getEstadoActual().equals("En revisión");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[LiderHandler] Revisión del líder: OK, aprobado.");
        doc.approve(); // En revisión → Aprobado
    }
}
