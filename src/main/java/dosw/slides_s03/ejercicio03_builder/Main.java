package dosw.slides_s03.ejercicio03_builder;

/**
 * Ejercicio #3 — Builder (DOSW 1 - S03.pptx, diapositivas 12-15).
 * Fábrica de juguetes: mismo proceso de ensamblaje (cabeza, cuerpo,
 * brazos, piernas, accesorios opcionales), distinto resultado según
 * el tipo de muñeco solicitado.
 */
public class Main {
    public static void main(String[] args) {
        FabricaJuguetesDirector director = new FabricaJuguetesDirector();

        Muneco accion = director.construirMunecoDeAccion(new MunecoBuilder());
        System.out.println(accion);

        Muneco clasica = director.construirMunecaClasica(new MunecoBuilder());
        System.out.println(clasica);

        // También se puede usar el Builder directamente, sin Director,
        // para una configuración a medida:
        Muneco personalizado = new MunecoBuilder()
                .setCabeza("cabeza de robot")
                .setCuerpo("cuerpo metálico")
                .setBrazos("brazos con pinzas")
                .setPiernas("piernas con ruedas")
                .addAccesorio("linterna en el pecho")
                .build();
        System.out.println(personalizado);
    }
}
