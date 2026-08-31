package dosw.taller4_patrones.ejercicio04_videojuego;

/**
 * Decorador base: envuelve un Character (tipado por la interfaz) para
 * agregar un poder temporal durante la partida. Al terminar el
 * efecto, el wrapper simplemente se descarta sin afectar la clase
 * base del personaje.
 */
public abstract class PowerDecorator implements Character {

    protected final Character personajeEnvuelto;

    protected PowerDecorator(Character personajeEnvuelto) {
        this.personajeEnvuelto = personajeEnvuelto;
    }
}
