package dosw.taller4_patrones.ejercicio01_pagos;

// Factory Method: cada país construye el proveedor de pago correcto, sin que el Checkout lo decida.
public interface PaymentFactory {
    PaymentStrategy create(String tipo);
}
