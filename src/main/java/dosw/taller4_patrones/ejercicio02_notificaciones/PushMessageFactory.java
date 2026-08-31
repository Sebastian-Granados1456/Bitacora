package dosw.taller4_patrones.ejercicio02_notificaciones;

// Genera un payload tipo JSON, propio del canal push.
public class PushMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("{\"pedido\":\"" + event.pedidoId()
                + "\",\"estado\":\"" + event.nuevoEstado() + "\"}");
    }
}
