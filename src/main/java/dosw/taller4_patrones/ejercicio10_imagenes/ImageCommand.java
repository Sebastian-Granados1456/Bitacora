package dosw.taller4_patrones.ejercicio10_imagenes;

// Command: encapsula una operación reversible sobre el editor (execute + undo).
public interface ImageCommand {
    void execute();
    void undo();
}
