package dosw.slides_s03.ejercicio11_strategy;

/**
 * Ejercicio #11 — Strategy (DOSW 1 - S03.pptx, diapositivas 47-50).
 * App de navegación: el algoritmo de cálculo de ruta (más rápida, más
 * corta, sin peajes) no está acoplado a la app — el usuario puede
 * cambiar la preferencia sin modificar AplicacionNavegacion.
 */
public class Main {
    public static void main(String[] args) {
        AplicacionNavegacion app = new AplicacionNavegacion(new RutaMasRapida());
        System.out.println(app.navegar("Bogotá", "Medellín"));

        app.setEstrategia(new RutaMasCorta());
        System.out.println(app.navegar("Bogotá", "Medellín"));

        app.setEstrategia(new RutaSinPeajes());
        System.out.println(app.navegar("Bogotá", "Medellín"));
    }
}
