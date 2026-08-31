package dosw.slides_s03.ejercicio01_factorymethod;

/**
 * Factory Method: clase creadora que decide qué producto concreto
 * instanciar a partir de un tipo (String), sin que el cliente conozca
 * las clases concretas. Es un método estático porque aquí no hace
 * falta una jerarquía de creadores (no hay subclases de fábrica).
 */
public class PaymentFactory {

    // Crea el PaymentMethod correspondiente al tipo pedido; lanza error si no existe.
    public static PaymentMethod create(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "TARJETA" -> new TarjetaCreditoPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "TRANSFERENCIA" -> new TransferenciaBancariaPayment();
            default -> throw new IllegalArgumentException("Método de pago no soportado: " + tipo);
        };
    }
}
