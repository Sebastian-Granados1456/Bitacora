package dosw.taller4_patrones.ejercicio07_documentos;

// Estado final: rechazado. Estado terminal, igual que Aprobado.
public class RejectedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        // un documento rechazado no se aprueba retroactivamente en este flujo.
    }

    @Override
    public void reject(Document doc) {
        // ya está rechazado: no hace nada más.
    }

    @Override
    public String nombre() {
        return "Rechazado";
    }
}
