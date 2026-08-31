package dosw.taller4_patrones.ejercicio01_pagos;

/**
 * El Checkout trabaja únicamente con PaymentStrategy: nunca cambia,
 * sin importar cuántos países o medios de pago se agreguen. La
 * Factory (recibida por fuera) es la única que decide qué Strategy
 * instanciar según el país.
 */
public class Checkout {

    private final PaymentFactory factory;

    public Checkout(PaymentFactory factory) {
        this.factory = factory;
    }

    // Construye el medio de pago pedido y ejecuta el cobro.
    public void pagar(String medio, double monto) {
        PaymentStrategy strategy = factory.create(medio);
        strategy.process(monto);
    }
}
