package dosw.taller4_patrones.ejercicio06_recomendaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject del Observer: mantiene la estrategia (algoritmo) vigente del
 * usuario. Al cambiar de preferencia, notifica a todos sus
 * componentes suscritos, que a su vez usan la nueva Strategy — así
 * "cambiar el cómo" (Strategy) dispara "el aviso a quién actualizar"
 * (Observer) sin acoplar ambos conceptos.
 */
public class PerfilUsuario {

    private final User user;
    private RecommendationAlgorithm algoritmoActual;
    private final List<PreferenceObserver> observers = new ArrayList<>();

    public PerfilUsuario(User user, RecommendationAlgorithm algoritmoInicial) {
        this.user = user;
        this.algoritmoActual = algoritmoInicial;
    }

    // Registra un componente de la UI que debe reaccionar a cambios de preferencia.
    public void addObserver(PreferenceObserver observer) {
        observers.add(observer);
    }

    // Cambia el algoritmo de recomendación y notifica a todos los componentes suscritos.
    public void cambiarPreferencia(RecommendationAlgorithm nuevoAlgoritmo) {
        this.algoritmoActual = nuevoAlgoritmo;
        observers.forEach(observer -> observer.onPreferenceChanged(user, algoritmoActual));
    }
}
