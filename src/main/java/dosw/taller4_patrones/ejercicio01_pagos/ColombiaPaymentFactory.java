package dosw.taller4_patrones.ejercicio01_pagos;

// Factory concreta: solo conoce los medios de pago disponibles en Colombia.
public class ColombiaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "TARJETA" -> new TarjetaStrategy();
            case "PSE" -> new PseStrategy();
            case "NEQUI" -> new NequiStrategy();
            default -> throw new IllegalArgumentException("Medio de pago no disponible en Colombia: " + tipo);
        };
    }
}
