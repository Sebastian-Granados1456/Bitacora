package dosw.taller4_patrones.ejercicio09_autenticacion;

// Estrategia concreta: autenticación federada con cuenta de Google.
public class GoogleStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("Autenticando con Google OAuth...");
        return new AuthResult(true, credentials.usuario());
    }
}
