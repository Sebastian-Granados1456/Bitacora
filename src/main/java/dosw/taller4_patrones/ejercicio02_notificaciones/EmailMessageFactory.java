package dosw.taller4_patrones.ejercicio02_notificaciones;

// Genera el mensaje en formato HTML, propio del canal correo.
public class EmailMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("<html><body>Pedido " + event.pedidoId()
                + " cambió a estado <b>" + event.nuevoEstado() + "</b></body></html>");
    }
}
