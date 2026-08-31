package dosw.slides_s03.ejercicio09_command;

/**
 * Ejercicio #9 — Command (DOSW 1 - S03.pptx, diapositivas 37-40).
 * Personaje de videojuego con acciones (caminar, saltar, atacar,
 * defenderse) encapsuladas como comandos, usando method references
 * (ComandoJuego es una interfaz funcional con un único método
 * ejecutar()) en vez de crear una clase concreta por cada acción.
 */
public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Héroe");
        ControlDeJuego control = new ControlDeJuego();

        control.setComando(heroe::caminar);
        control.press();

        control.setComando(heroe::saltar);
        control.press();

        control.setComando(heroe::atacar);
        control.press();

        control.setComando(heroe::defenderse);
        control.press();
    }
}
