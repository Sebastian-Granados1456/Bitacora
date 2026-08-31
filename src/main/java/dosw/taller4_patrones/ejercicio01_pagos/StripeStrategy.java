package dosw.taller4_patrones.ejercicio01_pagos;

// Estrategia concreta usada en USA: Stripe.
public class StripeStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.printf("Procesando pago con Stripe por $%.2f%n", amount);
    }
}
