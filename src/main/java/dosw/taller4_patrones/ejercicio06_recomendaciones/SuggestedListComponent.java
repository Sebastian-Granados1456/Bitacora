package dosw.taller4_patrones.ejercicio06_recomendaciones;

// Observer concreto: actualiza la lista de "sugeridos" usando el algoritmo (Strategy) vigente.
public class SuggestedListComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user, RecommendationAlgorithm nuevoAlgoritmo) {
        System.out.println("[SuggestedList] Actualizando con: " + nuevoAlgoritmo.recommend(user));
    }
}
