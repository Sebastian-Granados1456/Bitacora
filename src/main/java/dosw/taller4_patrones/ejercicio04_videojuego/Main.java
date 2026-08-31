package dosw.taller4_patrones.ejercicio04_videojuego;

/**
 * TALLER_DOSW_#4 — Ejercicio #04: Plataforma de Videojuegos — Personajes.
 * Combina Builder (construye el personaje base al inicio de la
 * partida: armadura, arma, habilidad) con Decorator (envuelve el
 * personaje con poderes temporales durante la partida —
 * escudo/velocidad/invisibilidad— sin modificar la clase base).
 */
public class Main {
    public static void main(String[] args) {
        Character warrior = new WarriorBuilder()
                .setArmor("acero")
                .setWeapon("espada")
                .setSkill("furia de batalla")
                .build();

        System.out.println(warrior.attack());

        Character conPoderes = new ShieldDecorator(
                new SpeedDecorator(warrior));

        System.out.println(conPoderes.attack());
    }
}
