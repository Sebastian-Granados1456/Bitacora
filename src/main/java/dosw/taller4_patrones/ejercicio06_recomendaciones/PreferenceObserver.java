package dosw.taller4_patrones.ejercicio06_recomendaciones;

// Observer: reacciona cuando el usuario cambia sus preferencias de recomendación.
public interface PreferenceObserver {
    void onPreferenceChanged(User user, RecommendationAlgorithm nuevoAlgoritmo);
}
