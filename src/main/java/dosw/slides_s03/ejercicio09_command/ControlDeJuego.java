package dosw.slides_s03.ejercicio09_command;

/**
 * Emisor (Invoker): guarda una referencia al comando actual y lo
 * ejecuta sin conocer qué acción concreta realiza ni sobre qué
 * personaje actúa — solo sabe que es un ComandoJuego.
 */
public class ControlDeJuego {

    private ComandoJuego comandoActual;

    // Asocia el comando que se ejecutará en el próximo press().
    public void setComando(ComandoJuego comando) {
        this.comandoActual = comando;
    }

    // Dispara el comando actualmente configurado.
    public void press() {
        comandoActual.ejecutar();
    }
}
