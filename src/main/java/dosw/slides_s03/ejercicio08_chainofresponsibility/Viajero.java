package dosw.slides_s03.ejercicio08_chainofresponsibility;

// Solicitud que viaja a lo largo de la cadena de controles migratorios.
public class Viajero {

    private final String nombre;
    private final boolean pasaporteValido;
    private final boolean sinAntecedentes;
    private final boolean motivoViajeClaro;

    public Viajero(String nombre, boolean pasaporteValido, boolean sinAntecedentes, boolean motivoViajeClaro) {
        this.nombre = nombre;
        this.pasaporteValido = pasaporteValido;
        this.sinAntecedentes = sinAntecedentes;
        this.motivoViajeClaro = motivoViajeClaro;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPasaporteValido() {
        return pasaporteValido;
    }

    public boolean isSinAntecedentes() {
        return sinAntecedentes;
    }

    public boolean isMotivoViajeClaro() {
        return motivoViajeClaro;
    }
}
