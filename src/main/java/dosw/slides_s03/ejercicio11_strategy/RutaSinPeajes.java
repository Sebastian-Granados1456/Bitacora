package dosw.slides_s03.ejercicio11_strategy;

// Estrategia concreta: evita vías con costo, aunque no sea la más rápida ni la más corta.
public class RutaSinPeajes implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta sin peajes de " + origen + " a " + destino + ": evitando autopistas de pago.";
    }
}
