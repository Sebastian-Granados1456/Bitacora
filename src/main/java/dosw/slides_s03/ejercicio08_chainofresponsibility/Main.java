package dosw.slides_s03.ejercicio08_chainofresponsibility;

/**
 * Ejercicio #8 — Chain of Responsibility (DOSW 1 - S03.pptx, diapositivas 33-36).
 * Controles migratorios de Estados Unidos: la solicitud pasa por
 * Pasaporte → Antecedentes → Motivo de viaje → Aprobación final; cada
 * control decide si aprueba (pasa al siguiente) o rechaza (detiene la
 * cadena). El viajero no sabe cuántos controles existen.
 */
public class Main {
    public static void main(String[] args) {
        ControlMigratorio cadena = new RevisionPasaporte();
        cadena.setSiguiente(new ControlAntecedentes())
                .setSiguiente(new RevisionMotivoViaje())
                .setSiguiente(new AprobacionFinal());

        Viajero viajeroOk = new Viajero("Ana", true, true, true);
        Viajero viajeroRechazado = new Viajero("Luis", true, false, true);

        System.out.println(cadena.procesar(viajeroOk));
        System.out.println(cadena.procesar(viajeroRechazado));
    }
}
