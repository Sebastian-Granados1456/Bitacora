package dosw.taller4_patrones.ejercicio02_notificaciones;

/**
 * TALLER_DOSW_#4 — Ejercicio #02: Sistema de Notificaciones Multicanal.
 * Combina Observer (el Pedido avisa a sus canales activos sin
 * conocerlos) con Factory Method (cada canal construye su propio
 * mensaje en el formato correcto). El Pedido cambia de estado →
 * notifica a los Observers → cada uno usa su Factory para formatear
 * el mensaje → "envía".
 */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PED-1001");
        pedido.addObserver(new EmailNotifier());
        pedido.addObserver(new SmsNotifier());
        pedido.addObserver(new PushNotifier());

        pedido.cambiarEstado("enviado");
        pedido.cambiarEstado("entregado");
    }
}
