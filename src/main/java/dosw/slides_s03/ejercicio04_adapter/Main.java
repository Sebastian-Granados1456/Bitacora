package dosw.slides_s03.ejercicio04_adapter;

/**
 * Ejercicio #4 — Adapter (DOSW 1 - S03.pptx, diapositivas 16-19).
 * Gasolinería inteligente: el sistema central solo conoce
 * SistemaAbastecimiento.abastecer(litros); los cargadores eléctricos
 * de terceros (interfaces incompatibles) se conectan a través de sus
 * respectivos adaptadores sin tocar el sistema central.
 */
public class Main {
    public static void main(String[] args) {
        SistemaAbastecimiento[] surtidores = {
                new SurtidorCombustion(),
                new AdaptadorCargadorRapido(new CargadorElectricoRapido()),
                new AdaptadorCargadorLento(new CargadorElectricoLento())
        };

        for (SistemaAbastecimiento surtidor : surtidores) {
            surtidor.abastecer(10.0);
        }
    }
}
