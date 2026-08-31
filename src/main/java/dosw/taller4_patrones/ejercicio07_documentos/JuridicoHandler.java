package dosw.taller4_patrones.ejercicio07_documentos;

// Handler concreto: revisión jurídica. Solo actúa una vez el documento ya fue aprobado por el líder.
public class JuridicoHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return doc.getEstadoActual().equals("Aprobado");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[JuridicoHandler] Revisión jurídica: OK, sin observaciones.");
        // Documento ya está en Aprobado (estado terminal); este handler solo audita, no cambia estado.
    }
}
