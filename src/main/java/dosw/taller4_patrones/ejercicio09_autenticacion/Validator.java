package dosw.taller4_patrones.ejercicio09_autenticacion;

/**
 * Chain of Responsibility: cada validador decide si pasa al
 * siguiente o lanza AccessDeniedException, deteniendo la cadena.
 * Se ejecuta DESPUÉS de la autenticación (que resuelve el Strategy).
 */
public abstract class Validator {

    private Validator next;

    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }

    // Valida la solicitud; si pasa, delega al siguiente validador de la cadena (si existe).
    public void validate(AuthResult authResult) {
        check(authResult);
        if (next != null) {
            next.validate(authResult);
        }
    }

    // Lanza AccessDeniedException si esta validación específica no se cumple.
    protected abstract void check(AuthResult authResult);
}
