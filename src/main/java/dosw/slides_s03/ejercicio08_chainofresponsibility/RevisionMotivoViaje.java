package dosw.slides_s03.ejercicio08_chainofresponsibility;

// Tercer control de la cadena: revisa que el motivo de viaje sea claro.
public class RevisionMotivoViaje extends ControlMigratorio {
    @Override
    protected String evaluar(Viajero viajero) {
        return viajero.isMotivoViajeClaro() ? null
                : "Rechazado en Revisión de motivos del viaje: " + viajero.getNombre();
    }
}
