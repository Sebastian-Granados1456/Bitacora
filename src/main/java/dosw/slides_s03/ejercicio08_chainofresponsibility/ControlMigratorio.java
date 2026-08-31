package dosw.slides_s03.ejercicio08_chainofresponsibility;

/**
 * Clase manejadora base: cada control decide si aprueba (y pasa al
 * siguiente) o rechaza (y detiene la cadena). El viajero no conoce
 * cuántos controles hay ni cuál lo rechazó — solo ve el resultado final.
 */
public abstract class ControlMigratorio {

    private ControlMigratorio siguiente;

    // Encadena el siguiente control; devuelve ese mismo control para poder seguir encadenando.
    public ControlMigratorio setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    // Procesa al viajero: si este control lo rechaza, la cadena se detiene aquí.
    public String procesar(Viajero viajero) {
        String resultado = evaluar(viajero);
        if (resultado != null) {
            return resultado; // rechazado en este control
        }
        if (siguiente != null) {
            return siguiente.procesar(viajero);
        }
        return "Aprobado: " + viajero.getNombre() + " puede ingresar a Estados Unidos.";
    }

    // Devuelve un mensaje de rechazo si este control no aprueba al viajero, o null si aprueba.
    protected abstract String evaluar(Viajero viajero);
}
