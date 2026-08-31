package dosw.taller4_patrones.ejercicio01_pagos;

// Estrategia concreta usada en Colombia: PSE (débito bancario en línea).
public class PseStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.printf("Procesando pago con PSE por $%.2f%n", amount);
    }
}
