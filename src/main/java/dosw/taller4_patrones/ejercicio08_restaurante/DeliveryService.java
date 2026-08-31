package dosw.taller4_patrones.ejercicio08_restaurante;

// Observer concreto: domicilio prepara la ruta de entrega del pedido confirmado.
public class DeliveryService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Domicilio] Preparando ruta de entrega para: " + order);
    }
}
