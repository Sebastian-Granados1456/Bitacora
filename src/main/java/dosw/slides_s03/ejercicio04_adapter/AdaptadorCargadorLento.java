package dosw.slides_s03.ejercicio04_adapter;

/**
 * Adapter: traduce la interfaz SistemaAbastecimiento (litros) hacia
 * CargadorElectricoLento (KWh). Factor de conversión dado en el
 * enunciado: litros * 7.0 = KWh en el modelo lento.
 */
public class AdaptadorCargadorLento implements SistemaAbastecimiento {

    private static final double FACTOR_LENTO = 7.0;
    private final CargadorElectricoLento cargador;

    public AdaptadorCargadorLento(CargadorElectricoLento cargador) {
        this.cargador = cargador;
    }

    @Override
    public void abastecer(double litros) {
        double kwh = litros * FACTOR_LENTO;
        cargador.suministrarKWh(kwh);
    }
}
