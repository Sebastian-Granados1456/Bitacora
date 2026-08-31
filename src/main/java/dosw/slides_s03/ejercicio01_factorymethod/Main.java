package dosw.slides_s03.ejercicio01_factorymethod;

/**
 * Ejercicio #1 — Factory Method (DOSW 1 - S03.pptx, diapositivas 4-7).
 * Plataforma de e-commerce que paga con Tarjeta, PayPal o Transferencia
 * sin acoplarse a las clases concretas: el cliente solo pide a la
 * Factory el método por nombre y llama pay() sobre la interfaz.
 */
public class Main {
    public static void main(String[] args) {
        PaymentMethod tarjeta = PaymentFactory.create("TARJETA");
        tarjeta.pay(150000.50);

        PaymentMethod paypal = PaymentFactory.create("PAYPAL");
        paypal.pay(89.99);

        PaymentMethod transferencia = PaymentFactory.create("TRANSFERENCIA");
        transferencia.pay(2300000.0);
    }
}
