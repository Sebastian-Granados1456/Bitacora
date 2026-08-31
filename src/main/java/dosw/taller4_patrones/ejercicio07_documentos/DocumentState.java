package dosw.taller4_patrones.ejercicio07_documentos;

// State: cada estado sabe a qué estado puede transicionar. Elimina los switch/if de estado en Document.
public interface DocumentState {
    void approve(Document doc);
    void reject(Document doc);
    String nombre();
}
