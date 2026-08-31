package dosw.taller4_patrones.ejercicio08_restaurante;

// Observer: cada subsistema reacciona a la confirmación del pedido sin que Order lo conozca.
public interface OrderObserver {
    void onOrderConfirmed(Order order);
}
