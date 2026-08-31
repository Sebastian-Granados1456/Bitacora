package dosw.taller4_patrones.ejercicio06_recomendaciones;

// Observer concreto: re-renderiza la página principal usando el algoritmo (Strategy) vigente.
public class HomePageComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user, RecommendationAlgorithm nuevoAlgoritmo) {
        System.out.println("[HomePage] Actualizando con: " + nuevoAlgoritmo.recommend(user));
    }
}
