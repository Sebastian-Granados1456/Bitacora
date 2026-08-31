package dosw.slides_s03.ejercicio08_chainofresponsibility;

// Segundo control de la cadena: verifica antecedentes.
public class ControlAntecedentes extends ControlMigratorio {
    @Override
    protected String evaluar(Viajero viajero) {
        return viajero.isSinAntecedentes() ? null
                : "Rechazado en Control de antecedentes: " + viajero.getNombre();
    }
}
