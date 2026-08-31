package dosw.taller4_patrones.ejercicio08_restaurante;

// Observer concreto: cocina recibe la orden de preparar el pedido confirmado.
public class KitchenService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Cocina] Preparando: " + order);
    }
}
