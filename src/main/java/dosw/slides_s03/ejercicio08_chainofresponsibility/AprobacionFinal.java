package dosw.slides_s03.ejercicio08_chainofresponsibility;

// Último control de la cadena: aprobación final por migración (siempre aprueba si llegó hasta aquí).
public class AprobacionFinal extends ControlMigratorio {
    @Override
    protected String evaluar(Viajero viajero) {
        return null; // si superó los controles anteriores, migración aprueba
    }
}
