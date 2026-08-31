package dosw.slides_s03.ejercicio11_strategy;

// Interfaz Estrategia: contrato común para todos los algoritmos de cálculo de ruta.
public interface EstrategiaRuta {
    String calcularRuta(String origen, String destino);
}
