package dosw.taller4_patrones.ejercicio07_documentos;

/**
 * Chain of Responsibility: cada handler decide si procesa el
 * documento (según canHandle) o lo pasa al siguiente. Al procesar,
 * invoca document.approve()/reject(), y es el DocumentState actual
 * quien ejecuta la transición correspondiente.
 */
public abstract class DocumentHandler {

    private DocumentHandler next;

    public DocumentHandler setNext(DocumentHandler next) {
        this.next = next;
        return next;
    }

    // Procesa el documento si corresponde a este handler; si no, delega al siguiente de la cadena.
    public void handle(Document doc) {
        if (canHandle(doc)) {
            process(doc);
        } else if (next != null) {
            next.handle(doc);
        }
    }

    protected abstract boolean canHandle(Document doc);
    protected abstract void process(Document doc);
}
