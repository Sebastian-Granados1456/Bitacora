package dosw.slides_s03.ejercicio01_factorymethod;

// Producto concreto: pago con PayPal.
public class PayPalPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.printf("Pago con PayPal por $ %.2f%n", amount);
    }
}
