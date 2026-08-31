package dosw.taller4_patrones.ejercicio09_autenticacion;

// Excepción lanzada por cualquier validador de la cadena cuando la solicitud no cumple su criterio.
public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException(String mensaje) {
        super(mensaje);
    }
}
