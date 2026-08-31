package dosw.taller4_patrones.ejercicio01_pagos;

// Estrategia concreta usada en Colombia: Nequi (billetera digital).
public class NequiStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.printf("Procesando pago con Nequi por $%.2f%n", amount);
    }
}
