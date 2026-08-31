package dosw.taller4_patrones.ejercicio04_videojuego;

/**
 * Personaje base construido por el Builder al inicio de la partida:
 * guarda armadura, arma y habilidad configuradas paso a paso.
 * Sus poderes temporales NO se guardan aquí — esos llegan después
 * mediante Decorator, sin modificar esta clase.
 */
public class BaseCharacter implements Character {

    private final String tipo;
    private final String armadura;
    private final String arma;
    private final String habilidad;

    BaseCharacter(String tipo, String armadura, String arma, String habilidad) {
        this.tipo = tipo;
        this.armadura = armadura;
        this.arma = arma;
        this.habilidad = habilidad;
    }

    @Override
    public String attack() {
        return tipo + " (armadura: " + armadura + ", arma: " + arma
                + ", habilidad: " + habilidad + ") ataca";
    }
}
