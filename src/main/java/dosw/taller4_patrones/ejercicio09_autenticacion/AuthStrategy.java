package dosw.taller4_patrones.ejercicio09_autenticacion;

// Strategy: cada mecanismo de autenticación (password, Google, biometría...) es intercambiable.
public interface AuthStrategy {
    AuthResult authenticate(Credentials credentials);
}
