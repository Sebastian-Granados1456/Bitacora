package dosw.slides_s03.ejercicio01_factorymethod;

// Producto concreto: pago por transferencia bancaria.
public class TransferenciaBancariaPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Transferencia Bancaria por $ %.2f%n", amount);
    }
}
