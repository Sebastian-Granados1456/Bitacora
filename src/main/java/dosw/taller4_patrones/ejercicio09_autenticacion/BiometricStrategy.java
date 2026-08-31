package dosw.taller4_patrones.ejercicio09_autenticacion;

// Estrategia concreta: autenticación biométrica (huella/rostro).
public class BiometricStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials credentials) {
        System.out.println("Autenticando con biometría...");
        return new AuthResult(true, credentials.usuario());
    }
}
