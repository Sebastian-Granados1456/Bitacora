package dosw.taller4_patrones.ejercicio06_recomendaciones;

import java.util.List;

// Estrategia concreta: recomienda según el historial de visualización del usuario.
public class HistoryStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Basado en tu historial, " + user.nombre() + ": Documental X"));
    }
}
