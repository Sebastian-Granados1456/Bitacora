package dosw.slides_s03.ejercicio11_strategy;

/**
 * Contexto: mantiene una referencia a la estrategia activa y se
 * comunica con ella solo a través de la interfaz EstrategiaRuta. No
 * sabe qué algoritmo concreto ejecuta; el cliente puede cambiarlo en
 * cualquier momento con setEstrategia().
 */
public class AplicacionNavegacion {

    private EstrategiaRuta estrategia;

    public AplicacionNavegacion(EstrategiaRuta estrategiaInicial) {
        this.estrategia = estrategiaInicial;
    }

    // Permite cambiar el algoritmo de cálculo de ruta en tiempo de ejecución.
    public void setEstrategia(EstrategiaRuta estrategia) {
        this.estrategia = estrategia;
    }

    // Delega el cálculo a la estrategia actualmente configurada.
    public String navegar(String origen, String destino) {
        return estrategia.calcularRuta(origen, destino);
    }
}
