package dosw.taller4_patrones.ejercicio02_notificaciones;

/**
 * Observer concreto: al recibir el aviso, usa su propia Factory Method
 * para construir el mensaje en el formato del canal (HTML) y "enviarlo".
 */
public class EmailNotifier implements NotificationObserver {

    private final MessageFactory messageFactory = new EmailMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message mensaje = messageFactory.build(event);
        System.out.println("[Email] " + mensaje.contenido());
    }
}
