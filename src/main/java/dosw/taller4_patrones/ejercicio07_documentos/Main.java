package dosw.taller4_patrones.ejercicio07_documentos;

/**
 * TALLER_DOSW_#4 — Ejercicio #07: Flujo de Aprobación de Documentos.
 * Combina Chain of Responsibility (AutorHandler → LiderHandler →
 * JuridicoHandler, cada uno decide si procesa el documento en su
 * estado actual) con State (DraftState/InReviewState/ApprovedState/
 * RejectedState, que ejecutan la transición correspondiente). Un
 * handler de la cadena invoca document.approve()/reject() → el State
 * actual del documento ejecuta la transición.
 */
public class Main {
    public static void main(String[] args) {
        Document documento = new Document("Contrato de servicios");
        System.out.println("Estado inicial: " + documento.getEstadoActual());

        DocumentHandler cadena = new AutorHandler();
        cadena.setNext(new LiderHandler())
                .setNext(new JuridicoHandler());

        cadena.handle(documento);
        System.out.println("Estado tras AutorHandler: " + documento.getEstadoActual());

        cadena.handle(documento);
        System.out.println("Estado tras LiderHandler: " + documento.getEstadoActual());

        cadena.handle(documento);
        System.out.println("Estado tras JuridicoHandler: " + documento.getEstadoActual());
    }
}
