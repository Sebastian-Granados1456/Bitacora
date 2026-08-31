package dosw.taller4_patrones.ejercicio09_autenticacion;

// Primer validador de la cadena: exige que la autenticación previa (Strategy) haya sido exitosa.
public class CredentialValidator extends Validator {
    @Override
    protected void check(AuthResult authResult) {
        if (!authResult.exitoso()) {
            throw new AccessDeniedException("Credenciales inválidas para " + authResult.usuario());
        }
        System.out.println("[CredentialValidator] OK");
    }
}
