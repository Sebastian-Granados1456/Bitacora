package dosw.taller4_patrones.ejercicio08_restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder: arma el pedido personalizado paso a paso
 * (setSize/setMeat/addTopping/addSide encadenables), evitando un
 * constructor caótico con todos los ingredientes. build() entrega un
 * Order inmutable y completo.
 */
public class OrderBuilder {

    private Size size;
    private Meat meat;
    private final List<String> toppings = new ArrayList<>();
    private final List<String> sides = new ArrayList<>();

    public OrderBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(Meat meat) {
        this.meat = meat;
        return this;
    }

    public OrderBuilder addTopping(String... nombres) {
        toppings.addAll(List.of(nombres));
        return this;
    }

    public OrderBuilder addSide(String... nombres) {
        sides.addAll(List.of(nombres));
        return this;
    }

    public Order build() {
        return new Order(size, meat, toppings, sides);
    }
}
