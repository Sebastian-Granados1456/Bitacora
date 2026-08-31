package dosw.taller4_patrones.ejercicio05_bancario;

/**
 * Servicio del banco antiguo: interfaz incompatible con
 * PaymentProcessor (usa centavos en vez de un double con decimales,
 * y otro nombre de método). No se puede modificar esta clase.
 */
public class LegacyBankService {

    // Ejecuta la transacción en centavos sobre la cuenta indicada.
    public void executeTransaction(String cuenta, int centavos) {
        System.out.printf("[LegacyBankService] Transacción ejecutada en cuenta %s por %d centavos.%n",
                cuenta, centavos);
    }

    // Verifica el saldo de la cuenta, expresado también en centavos.
    public int verifyBalance(String cuenta) {
        return 100_000_00; // saldo simulado: $100.000,00 en centavos
    }
}
