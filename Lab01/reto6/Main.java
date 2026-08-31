/**
 * Reto 6 - La Máquina de Decisiones.
 * Demuestra los comandos pedidos en el orden del enunciado usando
 * MaquinaDecisiones.ejecutarComando().
 */
public class Main {
    public static void main(String[] args) {
        MaquinaDecisiones maquina = new MaquinaDecisiones();

        maquina.ejecutarComando("SALUDAR");
        maquina.ejecutarComando("BROMEAR");
        maquina.ejecutarComando("ANALIZAR");
        maquina.ejecutarComando("DANZAR");
        maquina.ejecutarComando("DESPEDIR");
        maquina.ejecutarComando("CANTAR");
        maquina.ejecutarComando("GRITAR");
        maquina.ejecutarComando("SUSURRAR");
    }
}
