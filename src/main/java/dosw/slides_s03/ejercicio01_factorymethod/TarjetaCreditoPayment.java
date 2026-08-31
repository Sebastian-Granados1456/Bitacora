package dosw.slides_s03.ejercicio01_factorymethod;

// Producto concreto: pago con tarjeta de crédito.
public class TarjetaCreditoPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Tarjeta de Crédito por $ %.2f%n", amount);
    }
}
