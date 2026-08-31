package dosw.slides_s03.ejercicio09_command;

/**
 * Receptor: contiene la lógica de negocio real. Los comandos solo
 * delegan aquí — el personaje es quien realmente "hace el trabajo".
 */
public class Personaje {

    private final String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public void caminar() {
        System.out.println(nombre + " camina.");
    }

    public void saltar() {
        System.out.println(nombre + " salta.");
    }

    public void atacar() {
        System.out.println(nombre + " ataca.");
    }

    public void defenderse() {
        System.out.println(nombre + " se defiende.");
    }
}
