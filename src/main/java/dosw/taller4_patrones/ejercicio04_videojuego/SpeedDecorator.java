package dosw.taller4_patrones.ejercicio04_videojuego;

// Poder temporal: velocidad extra añadida al ataque del personaje envuelto.
public class SpeedDecorator extends PowerDecorator {

    public SpeedDecorator(Character personajeEnvuelto) {
        super(personajeEnvuelto);
    }

    @Override
    public String attack() {
        return personajeEnvuelto.attack() + " + velocidad extra";
    }
}
