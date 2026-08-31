package dosw.taller4_patrones.ejercicio08_restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * Producto inmutable construido por OrderBuilder. También actúa como
 * Subject del Observer: solo expone confirm(), sin saber a quién
 * avisa — cada subsistema (cocina, facturación, domicilio) se
 * suscribe por fuera con addObserver().
 */
public class Order {

    private final Size size;
    private final Meat meat;
    private final List<String> toppings;
    private final List<String> sides;
    private final List<OrderObserver> observers = new ArrayList<>();

    Order(Size size, Meat meat, List<String> toppings, List<String> sides) {
        this.size = size;
        this.meat = meat;
        this.toppings = List.copyOf(toppings);
        this.sides = List.copyOf(sides);
    }

    // Registra un subsistema que debe reaccionar cuando el pedido se confirme.
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    // Confirma el pedido y notifica a todos los subsistemas suscritos.
    public void confirm() {
        observers.forEach(observer -> observer.onOrderConfirmed(this));
    }

    @Override
    public String toString() {
        return "Order[size=" + size + ", meat=" + meat + ", toppings=" + toppings + ", sides=" + sides + "]";
    }
}
