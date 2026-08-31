package dosw.taller4_patrones.ejercicio05_bancario;

/**
 * TALLER_DOSW_#4 — Ejercicio #05: Integración con Sistema Bancario Antiguo.
 * Combina Adapter (traduce PaymentProcessor ↔ LegacyBankService) con
 * Facade (oculta los pasos de inicialización tras procesarPago()). El
 * desarrollador llama BankFacade.procesarPago(monto) → la Facade
 * delega al LegacyBankAdapter → el Adapter traduce al formato legacy
 * → LegacyBankService ejecuta.
 */
public class Main {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade();
        facade.procesarPago(1500.50);
    }
}
