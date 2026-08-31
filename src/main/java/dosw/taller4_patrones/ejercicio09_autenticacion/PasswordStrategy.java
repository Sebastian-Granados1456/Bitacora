package dosw.taller4_patrones.ejercicio09_autenticacion;

// Estrategia concreta: autenticación con usuario/contraseña.
public class PasswordStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("Autenticando con usuario/contraseña...");
        return new AuthResult(true, credentials.usuario());
    }
}
