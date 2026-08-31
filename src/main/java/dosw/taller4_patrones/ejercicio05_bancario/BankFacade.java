package dosw.taller4_patrones.ejercicio05_bancario;

/**
 * Facade: expone un único método simple, procesarPago(monto), que
 * internamente orquesta los pasos de inicialización y delega en el
 * LegacyBankAdapter. El desarrollador que usa la Facade nunca toca
 * LegacyBankService directamente.
 */
public class BankFacade {

    private final PaymentProcessor adapter;

    public BankFacade() {
        // Los "8 pasos de inicialización" del enunciado se resumen aquí:
        // se crea el servicio legacy y se envuelve en su Adapter.
        System.out.println("Inicializando conexión, sesión y contexto bancario...");
        this.adapter = new LegacyBankAdapter(new LegacyBankService());
    }

    // Único punto de entrada para el desarrollador: procesa el pago sin exponer el legado.
    public void procesarPago(double monto) {
        adapter.pay(monto);
    }
}
