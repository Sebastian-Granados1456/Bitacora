package dosw.taller4_patrones.ejercicio02_notificaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject del Observer: mantiene la lista de canales activos (no todos
 * los usuarios tienen los mismos) y les avisa cuando cambia de estado.
 * Agregar un canal nuevo no requiere modificar esta clase.
 */
public class Pedido {

    private final String id;
    private final List<NotificationObserver> canalesActivos = new ArrayList<>();

    public Pedido(String id) {
        this.id = id;
    }

    // Registra un canal de notificación activo para este pedido.
    public void addObserver(NotificationObserver observer) {
        canalesActivos.add(observer);
    }

    // Cambia el estado del pedido y notifica a todos los canales activos.
    public void cambiarEstado(String nuevoEstado) {
        OrderEvent event = new OrderEvent(id, nuevoEstado);
        canalesActivos.forEach(observer -> observer.notify(event));
    }
}
