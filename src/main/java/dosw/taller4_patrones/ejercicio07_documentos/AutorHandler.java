package dosw.taller4_patrones.ejercicio07_documentos;

// Handler concreto: revisión del autor. Solo actúa mientras el documento está en Borrador.
public class AutorHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return doc.getEstadoActual().equals("Borrador");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[AutorHandler] Revisión del autor: OK, aprobado.");
        doc.approve(); // Borrador → En revisión
    }
}
