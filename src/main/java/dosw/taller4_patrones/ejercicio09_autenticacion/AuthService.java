package dosw.taller4_patrones.ejercicio09_autenticacion;

/**
 * Orquesta el flujo completo: selecciona la Strategy correcta según
 * el tipo de usuario, autentica, y pasa el resultado por la cadena de
 * validadores. Strategy resuelve "cómo autentico"; Chain resuelve
 * "si tengo acceso" — son fases distintas (autenticación vs
 * autorización).
 */
public class AuthService {

    private final AuthStrategy strategy;
    private final Validator cadenaValidadores;

    public AuthService(AuthStrategy strategy, Validator cadenaValidadores) {
        this.strategy = strategy;
        this.cadenaValidadores = cadenaValidadores;
    }

    // Autentica con la Strategy configurada y, si es exitosa, corre la cadena de validaciones.
    public void login(Credentials credentials) {
        AuthResult resultado = strategy.authenticate(credentials);
        cadenaValidadores.validate(resultado);
        System.out.println("Acceso concedido a " + resultado.usuario());
    }
}
