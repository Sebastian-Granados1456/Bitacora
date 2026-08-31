package dosw.slides_s03.ejercicio11_strategy;

// Estrategia concreta: prioriza la menor distancia, aunque tarde más (calles locales).
public class RutaMasCorta implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta más corta de " + origen + " a " + destino + ": por calles locales.";
    }
}
