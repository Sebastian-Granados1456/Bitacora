package dosw.slides_s03.ejercicio03_builder;

/**
 * Director: conoce las "recetas" de ensamblaje habituales y reutiliza
 * el mismo MunecoBuilder para producir configuraciones predefinidas
 * (aquí: muñeco de acción y muñeca clásica) sin repetir el orden de
 * pasos en cada punto donde se necesiten.
 */
public class FabricaJuguetesDirector {

    // Ensambla un muñeco de acción típico (con accesorio de combate).
    public Muneco construirMunecoDeAccion(MunecoBuilder builder) {
        return builder.setCabeza("cabeza de soldado")
                .setCuerpo("cuerpo articulado")
                .setBrazos("brazos con guantes")
                .setPiernas("piernas con botas")
                .addAccesorio("escudo de combate")
                .build();
    }

    // Ensambla una muñeca clásica típica (sin accesorios).
    public Muneco construirMunecaClasica(MunecoBuilder builder) {
        return builder.setCabeza("cabeza con cabello pintado")
                .setCuerpo("cuerpo de porcelana")
                .setBrazos("brazos fijos")
                .setPiernas("piernas fijas")
                .build();
    }
}
