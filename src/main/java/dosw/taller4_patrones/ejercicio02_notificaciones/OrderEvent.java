package dosw.taller4_patrones.ejercicio02_notificaciones;

// Evento simple: representa el cambio de estado de un pedido.
public record OrderEvent(String pedidoId, String nuevoEstado) {
}
