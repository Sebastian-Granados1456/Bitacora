package dosw.slides_s03.ejercicio10_iterator;

import java.util.Iterator;

/**
 * Ejercicio #10 — Iterator (DOSW 1 - S03.pptx, diapositivas 41-46).
 * Un turista recorre los lugares emblemáticos de Roma sin conocer
 * cómo el ItinerarioRoma guarda internamente esos datos: solo pide
 * un Iterator y avanza con hasNext()/next().
 */
public class Main {
    public static void main(String[] args) {
        ColeccionLugares itinerario = new ItinerarioRoma();

        Iterator<String> recorrido = itinerario.iterator();
        while (recorrido.hasNext()) {
            System.out.println("Visitando: " + recorrido.next());
        }

        // Al implementar Iterable, también funciona el for-each estándar de Java:
        for (String lugar : itinerario) {
            System.out.println("(for-each) " + lugar);
        }
    }
}
