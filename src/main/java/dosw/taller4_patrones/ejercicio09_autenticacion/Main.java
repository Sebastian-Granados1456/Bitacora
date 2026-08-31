package dosw.taller4_patrones.ejercicio09_autenticacion;

/**
 * TALLER_DOSW_#4 — Ejercicio #09: Sistema de Autenticación Empresarial.
 * Combina Strategy (mecanismo de autenticación según el tipo de
 * usuario) con Chain of Responsibility (validaciones posteriores en
 * secuencia: credenciales → permisos → ubicación → horario). Usuario
 * intenta acceder → AuthService selecciona la Strategy correcta →
 * autenticación exitosa → el resultado pasa por la cadena de
 * validadores → si todos aprueban, se concede acceso.
 */
public class Main {
    public static void main(String[] args) {
        Validator cadena = new CredentialValidator();
        cadena.setNext(new PermissionValidator())
                .setNext(new LocationValidator())
                .setNext(new TimeValidator());

        AuthService servicioPassword = new AuthService(new PasswordStrategy(), cadena);
        servicioPassword.login(new Credentials("ana.gomez"));

        AuthService servicioBiometrico = new AuthService(new BiometricStrategy(), cadena);
        servicioBiometrico.login(new Credentials("luis.perez"));
    }
}
