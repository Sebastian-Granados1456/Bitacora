package dosw.taller4_patrones.ejercicio05_bancario;

/**
 * Adapter: hace que LegacyBankService sea compatible con
 * PaymentProcessor, traduciendo amount (pesos con decimales) → cents
 * y pay() → executeTransaction().
 */
public class LegacyBankAdapter implements PaymentProcessor {

    private static final String CUENTA_POR_DEFECTO = "ACC-001";
    private final LegacyBankService legacy;

    public LegacyBankAdapter(LegacyBankService legacy) {
        this.legacy = legacy;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) Math.round(amount * 100); // traducción de pesos a centavos
        legacy.executeTransaction(CUENTA_POR_DEFECTO, cents);
    }
}
