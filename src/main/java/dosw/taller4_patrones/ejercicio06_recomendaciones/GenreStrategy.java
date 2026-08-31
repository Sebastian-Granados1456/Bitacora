package dosw.taller4_patrones.ejercicio06_recomendaciones;

import java.util.List;

// Estrategia concreta: recomienda según el género preferido del usuario.
public class GenreStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Comedia recomendada para " + user.nombre()));
    }
}
