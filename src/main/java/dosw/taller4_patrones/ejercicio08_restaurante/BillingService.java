package dosw.taller4_patrones.ejercicio08_restaurante;

// Observer concreto: facturación genera la cuenta del pedido confirmado.
public class BillingService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Facturación] Generando cuenta para: " + order);
    }
}
