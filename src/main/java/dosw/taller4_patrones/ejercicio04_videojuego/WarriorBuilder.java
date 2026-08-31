package dosw.taller4_patrones.ejercicio04_videojuego;

/**
 * Builder: construye un guerrero paso a paso (setArmor/setWeapon/
 * setSkill encadenables), evitando un constructor con muchos
 * parámetros. build() entrega el BaseCharacter listo para la partida.
 */
public class WarriorBuilder {

    private String armadura;
    private String arma;
    private String habilidad;

    public WarriorBuilder setArmor(String armadura) {
        this.armadura = armadura;
        return this;
    }

    public WarriorBuilder setWeapon(String arma) {
        this.arma = arma;
        return this;
    }

    public WarriorBuilder setSkill(String habilidad) {
        this.habilidad = habilidad;
        return this;
    }

    public Character build() {
        return new BaseCharacter("Guerrero", armadura, arma, habilidad);
    }
}
