package dosw.taller4_patrones.ejercicio01_pagos;

// Estrategia concreta usada en USA: PayPal.
public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.printf("Procesando pago con PayPal por $%.2f%n", amount);
    }
}
