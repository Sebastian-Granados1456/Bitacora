package dosw.taller4_patrones.ejercicio02_notificaciones;

// Observer concreto: construye el mensaje con la Factory de push (payload JSON).
public class PushNotifier implements NotificationObserver {

    private final MessageFactory messageFactory = new PushMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message mensaje = messageFactory.build(event);
        System.out.println("[Push] " + mensaje.contenido());
    }
}
