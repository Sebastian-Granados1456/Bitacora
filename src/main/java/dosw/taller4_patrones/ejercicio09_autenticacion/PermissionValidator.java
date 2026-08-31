package dosw.taller4_patrones.ejercicio09_autenticacion;

// Segundo validador: verifica que el usuario tenga permisos suficientes (simulado siempre en true).
public class PermissionValidator extends Validator {
    @Override
    protected void check(AuthResult authResult) {
        System.out.println("[PermissionValidator] OK, permisos suficientes para " + authResult.usuario());
    }
}
