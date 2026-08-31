/**
 * Canal B: procesa el mensaje con StringBuffer (más lento, seguro ante
 * hilos concurrentes). Se encarga de "descifrar" invirtiendo el texto.
 */
public class CanalB {

    // Invierte el texto recibido usando el método reverse() propio de
    // StringBuffer; simula el protocolo de descifrado seguro del canal B.
    public static String invertir(String texto) {
        return new StringBuffer(texto).reverse().toString();
    }
}
