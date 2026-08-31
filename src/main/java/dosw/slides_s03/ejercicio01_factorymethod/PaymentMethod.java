package dosw.slides_s03.ejercicio01_factorymethod;

/**
 * Interfaz común (el "producto") para todos los métodos de pago.
 * El código cliente (Main) solo conoce esta interfaz, nunca las clases
 * concretas — así se evita el acoplamiento que pide el enunciado.
 */
public interface PaymentMethod {

    // Procesa el pago e imprime el mensaje "Pago con METODO por $ MONTO".
    void pay(double amount);
}
