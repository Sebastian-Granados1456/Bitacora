package dosw.slides_s03.ejercicio10_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Colección concreta: guarda los lugares emblemáticos de Roma en una
 * estructura interna (aquí una List) que el cliente nunca ve
 * directamente. Solo expone iterator(), que entrega un Iterator
 * concreto propio sin revelar cómo se almacenan los datos.
 */
public class ItinerarioRoma implements ColeccionLugares {

    private final List<String> lugares = List.of(
            "Coliseo", "Foro Romano", "Fontana di Trevi", "Panteón", "Plaza de España"
    );

    @Override
    public Iterator<String> iterator() {
        return new IteradorItinerario();
    }

    /**
     * Iterador concreto: controla su propia posición actual de forma
     * independiente, así varios recorridos simultáneos del mismo
     * itinerario no interfieren entre sí.
     */
    private class IteradorItinerario implements Iterator<String> {

        private int posicionActual = 0;

        @Override
        public boolean hasNext() {
            return posicionActual < lugares.size();
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más lugares en el itinerario.");
            }
            return lugares.get(posicionActual++);
        }
    }
}
