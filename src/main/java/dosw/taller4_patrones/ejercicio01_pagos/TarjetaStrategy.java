package dosw.taller4_patrones.ejercicio01_pagos;

// Estrategia concreta usada en Colombia: tarjeta de crédito/débito.
public class TarjetaStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.printf("Procesando pago con Tarjeta por $%.2f%n", amount);
    }
}
