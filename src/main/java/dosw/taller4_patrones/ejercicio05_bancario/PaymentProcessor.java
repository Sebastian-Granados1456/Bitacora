package dosw.taller4_patrones.ejercicio05_bancario;

// Interfaz moderna que el sistema espera para procesar pagos.
public interface PaymentProcessor {
    void pay(double amount);
}
