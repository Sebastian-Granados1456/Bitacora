package dosw.taller4_patrones.ejercicio01_pagos;

// Strategy: encapsula el algoritmo de pago de cada medio, independiente del país.
public interface PaymentStrategy {
    void process(double amount);
}
