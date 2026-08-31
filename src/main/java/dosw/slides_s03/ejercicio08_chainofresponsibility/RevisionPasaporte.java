package dosw.slides_s03.ejercicio08_chainofresponsibility;

// Primer control de la cadena: valida pasaporte y visa.
public class RevisionPasaporte extends ControlMigratorio {
    @Override
    protected String evaluar(Viajero viajero) {
        return viajero.isPasaporteValido() ? null
                : "Rechazado en Revisión de pasaporte y visa: " + viajero.getNombre();
    }
}
