package dosw.taller4_patrones.ejercicio01_pagos;

/**
 * TALLER_DOSW_#4 — Ejercicio #01: Plataforma de Pagos Inteligentes.
 * Combina Strategy (cada medio de pago es un algoritmo intercambiable)
 * con Factory Method (según el país, se construye el proveedor
 * correcto). El usuario selecciona su país → la Factory construye el
 * gateway correcto → ese gateway implementa PaymentStrategy → el
 * Checkout llama strategy.process(amount) sin conocer cuál es.
 */
public class Main {
    public static void main(String[] args) {
        Checkout checkoutColombia = new Checkout(new ColombiaPaymentFactory());
        checkoutColombia.pagar("TARJETA", 150000.0);
        checkoutColombia.pagar("NEQUI", 45000.0);

        Checkout checkoutUsa = new Checkout(new UsaPaymentFactory());
        checkoutUsa.pagar("PAYPAL", 89.99);
        checkoutUsa.pagar("STRIPE", 120.50);
    }
}
