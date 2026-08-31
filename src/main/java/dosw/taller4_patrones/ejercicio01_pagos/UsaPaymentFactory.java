package dosw.taller4_patrones.ejercicio01_pagos;

// Factory concreta: solo conoce los medios de pago disponibles en USA.
public class UsaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "PAYPAL" -> new PayPalStrategy();
            case "STRIPE" -> new StripeStrategy();
            default -> throw new IllegalArgumentException("Medio de pago no disponible en USA: " + tipo);
        };
    }
}
