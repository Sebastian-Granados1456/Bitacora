package dosw.taller4_patrones.ejercicio09_autenticacion;

// Tercer validador: verifica que la ubicación de acceso sea válida (simulado siempre en true).
public class LocationValidator extends Validator {
    @Override
    protected void check(AuthResult authResult) {
        System.out.println("[LocationValidator] OK, ubicación permitida para " + authResult.usuario());
    }
}
