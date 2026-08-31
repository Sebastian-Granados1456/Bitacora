package dosw.taller4_patrones.ejercicio04_videojuego;

// Poder temporal: escudo de hielo añadido al ataque del personaje envuelto.
public class ShieldDecorator extends PowerDecorator {

    public ShieldDecorator(Character personajeEnvuelto) {
        super(personajeEnvuelto);
    }

    @Override
    public String attack() {
        return personajeEnvuelto.attack() + " + escudo de hielo activo";
    }
}
