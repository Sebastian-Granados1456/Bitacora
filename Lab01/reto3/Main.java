/**
 * Reto 3 - La Máquina de los Códigos Secretos.
 * Muestra el resultado de cada canal por separado y luego el descifrado
 * final combinando ambos.
 */
public class Main {
    public static void main(String[] args) {
        String mensaje = "clave";

        System.out.println("Canal A: \"" + CanalA.amplificar(mensaje) + "\"");
        System.out.println("Descifrado final:");
        System.out.println("\"" + Descifrador.DESCIFRAR.apply(mensaje) + "\"");
    }
}
