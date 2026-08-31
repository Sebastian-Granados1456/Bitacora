package dosw.taller4_patrones.ejercicio07_documentos;

// Estado final: aprobado. Ya no admite nuevas transiciones (estado terminal).
public class ApprovedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        // ya está aprobado: no hace nada más.
    }

    @Override
    public void reject(Document doc) {
        // un documento aprobado no se rechaza retroactivamente en este flujo.
    }

    @Override
    public String nombre() {
        return "Aprobado";
    }
}
