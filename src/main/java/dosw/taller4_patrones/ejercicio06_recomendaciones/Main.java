package dosw.taller4_patrones.ejercicio06_recomendaciones;

/**
 * TALLER_DOSW_#4 — Ejercicio #06: Motor de Recomendaciones.
 * Combina Strategy (algoritmos de recomendación intercambiables) con
 * Observer (componentes de la UI que se actualizan automáticamente al
 * cambiar la preferencia). Usuario cambia preferencias → el perfil
 * (Subject) notifica a sus Observers → cada uno re-actualiza su
 * contenido usando el nuevo algoritmo configurado.
 */
public class Main {
    public static void main(String[] args) {
        User usuario = new User("Camila");
        PerfilUsuario perfil = new PerfilUsuario(usuario, new PopularityStrategy());
        perfil.addObserver(new HomePageComponent());
        perfil.addObserver(new SuggestedListComponent());

        System.out.println("--- Preferencia inicial (popularidad) ---");
        perfil.cambiarPreferencia(new PopularityStrategy());

        System.out.println("--- Cambia a preferencia por género ---");
        perfil.cambiarPreferencia(new GenreStrategy());

        System.out.println("--- Cambia a preferencia por historial ---");
        perfil.cambiarPreferencia(new HistoryStrategy());
    }
}
