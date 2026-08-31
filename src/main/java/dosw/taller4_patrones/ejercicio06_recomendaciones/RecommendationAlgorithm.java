package dosw.taller4_patrones.ejercicio06_recomendaciones;

import java.util.List;

// Strategy: cada algoritmo de recomendación (género, historial, popularidad...) es intercambiable.
public interface RecommendationAlgorithm {
    List<Content> recommend(User user);
}
