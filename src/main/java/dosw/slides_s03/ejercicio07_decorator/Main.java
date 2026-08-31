package dosw.slides_s03.ejercicio07_decorator;

/**
 * Ejercicio #7 — Decorator (DOSW 1 - S03.pptx, diapositivas 29-32).
 * Simulador naval: los módulos (blindaje, radar, misiles,
 * antitorpedos) se combinan envolviendo el barco en tiempo de
 * ejecución, sin crear una subclase por cada combinación posible
 * (evita la explosión combinatoria 2^n que menciona TALLER_DOSW_#4).
 */
public class Main {
    public static void main(String[] args) {
        Barco fragata = new BarcoBase("Fragata", 50, 40);
        System.out.printf("%s → ataque=%d, defensa=%d%n",
                fragata.descripcion(), fragata.ataque(), fragata.defensa());

        Barco fragataEquipada = new SistemaAntitorpedos(
                new Misiles(
                        new RadarAvanzado(
                                new BlindajeReforzado(fragata))));

        System.out.printf("%s → ataque=%d, defensa=%d%n",
                fragataEquipada.descripcion(), fragataEquipada.ataque(), fragataEquipada.defensa());
    }
}
