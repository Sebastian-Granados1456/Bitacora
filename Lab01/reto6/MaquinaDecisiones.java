import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Máquina que responde a comandos escritos. Los 8 comandos se resuelven con
 * switch-case en dos grupos y luego se unifican en un único
 * Map<String, Runnable> para poder invocar cualquier comando con .run().
 */
public class MaquinaDecisiones {

    private final Map<String, Runnable> comandos = new LinkedHashMap<>();

    public MaquinaDecisiones() {
        registrarFragmento1();
        registrarFragmento2();
    }

    // Primer grupo de comandos: switch-case que decide qué mensaje imprimir
    // para SALUDAR/DESPEDIR/CANTAR/DANZAR, y guarda cada acción como lambda
    // ( () -> accion() ) dentro del mapa de comandos.
    private void registrarFragmento1() {
        for (String comando : new String[]{"SALUDAR", "DESPEDIR", "CANTAR", "DANZAR"}) {
            comandos.put(comando, () -> ejecutarFragmento1(comando));
        }
    }

    private void ejecutarFragmento1(String comando) {
        switch (comando) {
            case "SALUDAR" -> System.out.println("¡Saludos, viajero del Tiempo y del código!");
            case "DESPEDIR" -> System.out.println("Hasta la próxima compilación, viajero.");
            case "CANTAR" -> System.out.println("La la la... compilando melodías en tiempo real.");
            case "DANZAR" -> System.out.println("Girando en modo fiesta.");
        }
    }

    // Segundo grupo de comandos: mismo patrón que el anterior, pero para
    // BROMEAR/GRITAR/SUSURRAR/ANALIZAR, también registrado como Runnable.
    private void registrarFragmento2() {
        for (String comando : new String[]{"BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR"}) {
            comandos.put(comando, () -> ejecutarFragmento2(comando));
        }
    }

    private void ejecutarFragmento2(String comando) {
        switch (comando) {
            case "BROMEAR" -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
            case "GRITAR" -> System.out.println("¡¡¡STACK OVERFLOOOOOW!!!");
            case "SUSURRAR" -> System.out.println("psst... revisa el punto y coma de la línea 42.");
            case "ANALIZAR" -> System.out.println("Analizando datos... ¡Eres increíble!");
        }
    }

    // Ejecuta un único comando buscándolo en el mapa e invocando su Runnable
    // con .run() — el método propio de la interfaz funcional Runnable.
    public void ejecutarComando(String comando) {
        comandos.get(comando).run();
    }

    // Recorre TODOS los comandos registrados con forEach((cmd, accion) -> accion.run()),
    // demostrando que la máquina puede responder a cualquiera de los 8 comandos.
    public void ejecutarTodos() {
        comandos.forEach((cmd, accion) -> accion.run());
    }
}
