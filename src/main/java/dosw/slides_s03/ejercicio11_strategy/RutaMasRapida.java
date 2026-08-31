package dosw.slides_s03.ejercicio11_strategy;

// Estrategia concreta: prioriza el menor tiempo, aunque implique más distancia (autopistas).
public class RutaMasRapida implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta más rápida de " + origen + " a " + destino + ": por autopista.";
    }
}
