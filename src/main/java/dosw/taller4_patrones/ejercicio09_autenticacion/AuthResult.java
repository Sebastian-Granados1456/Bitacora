package dosw.taller4_patrones.ejercicio09_autenticacion;

// Resultado del proceso de autenticación (éxito/fracaso + el usuario autenticado).
public record AuthResult(boolean exitoso, String usuario) {
}
