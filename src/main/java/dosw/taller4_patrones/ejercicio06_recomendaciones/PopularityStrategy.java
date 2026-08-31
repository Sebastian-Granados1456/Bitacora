package dosw.taller4_patrones.ejercicio06_recomendaciones;

import java.util.List;

// Estrategia concreta: recomienda lo más popular en general, sin personalización.
public class PopularityStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Lo más popular ahora"));
    }
}
