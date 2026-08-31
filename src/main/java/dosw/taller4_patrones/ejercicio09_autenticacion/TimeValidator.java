package dosw.taller4_patrones.ejercicio09_autenticacion;

// Cuarto y último validador: verifica el horario laboral permitido (simulado siempre en true).
public class TimeValidator extends Validator {
    @Override
    protected void check(AuthResult authResult) {
        System.out.println("[TimeValidator] OK, dentro del horario laboral para " + authResult.usuario());
    }
}
