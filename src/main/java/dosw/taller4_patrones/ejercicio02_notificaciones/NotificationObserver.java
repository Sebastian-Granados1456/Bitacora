package dosw.taller4_patrones.ejercicio02_notificaciones;

// Observer: cada canal activo reacciona al mismo evento de forma independiente.
public interface NotificationObserver {
    void notify(OrderEvent event);
}
