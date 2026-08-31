package dosw.taller4_patrones.ejercicio08_restaurante;

/**
 * TALLER_DOSW_#4 — Ejercicio #08: Sistema de Pedidos en Restaurante.
 * Combina Builder (arma el pedido paso a paso: tamaño, carne, extras,
 * acompañamientos) con Observer (al confirmar, notifica a cocina,
 * facturación y domicilio sin conocerlos). Cliente configura con
 * Builder → build() retorna un Order inmutable → order.confirm()
 * notifica a todos los Observers registrados.
 */
public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setSize(Size.LARGE)
                .setMeat(Meat.DOUBLE_BEEF)
                .addTopping("queso", "lechuga")
                .addSide("papas", "gaseosa")
                .build();

        order.addObserver(new KitchenService());
        order.addObserver(new BillingService());
        order.addObserver(new DeliveryService());

        order.confirm();
    }
}
