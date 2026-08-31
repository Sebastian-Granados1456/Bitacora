package dosw.taller4_patrones.ejercicio02_notificaciones;

// Factory Method: cada canal construye el mensaje en su propio formato a partir del evento.
public interface MessageFactory {
    Message build(OrderEvent event);
}
