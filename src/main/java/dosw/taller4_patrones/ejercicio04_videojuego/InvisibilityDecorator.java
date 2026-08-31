package dosw.taller4_patrones.ejercicio04_videojuego;

// Poder temporal: invisibilidad añadida al ataque del personaje envuelto.
public class InvisibilityDecorator extends PowerDecorator {

    public InvisibilityDecorator(Character personajeEnvuelto) {
        super(personajeEnvuelto);
    }

    @Override
    public String attack() {
        return personajeEnvuelto.attack() + " + invisibilidad";
    }
}
