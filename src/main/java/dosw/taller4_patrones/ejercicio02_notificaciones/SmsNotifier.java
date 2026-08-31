package dosw.taller4_patrones.ejercicio02_notificaciones;

// Observer concreto: construye el mensaje con la Factory de SMS (texto plano, 160 chars).
public class SmsNotifier implements NotificationObserver {

    private final MessageFactory messageFactory = new SmsMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message mensaje = messageFactory.build(event);
        System.out.println("[SMS] " + mensaje.contenido());
    }
}
