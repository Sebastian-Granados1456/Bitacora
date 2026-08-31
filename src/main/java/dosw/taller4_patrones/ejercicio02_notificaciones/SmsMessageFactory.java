package dosw.taller4_patrones.ejercicio02_notificaciones;

// Genera texto plano corto (límite de 160 caracteres), propio del canal SMS.
public class SmsMessageFactory implements MessageFactory {

    private static final int LIMITE_SMS = 160;

    @Override
    public Message build(OrderEvent event) {
        String texto = "Pedido " + event.pedidoId() + ": " + event.nuevoEstado();
        String recortado = texto.length() > LIMITE_SMS ? texto.substring(0, LIMITE_SMS) : texto;
        return new Message(recortado);
    }
}
