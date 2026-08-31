package dosw.slides_s03.ejercicio04_adapter;

/**
 * Adapter: traduce la interfaz SistemaAbastecimiento (litros) hacia
 * CargadorElectricoRapido (KWh). Factor de conversión dado en el
 * enunciado: litros * 8.0 = KWh en el modelo rápido.
 */
public class AdaptadorCargadorRapido implements SistemaAbastecimiento {

    private static final double FACTOR_RAPIDO = 8.0;
    private final CargadorElectricoRapido cargador;

    public AdaptadorCargadorRapido(CargadorElectricoRapido cargador) {
        this.cargador = cargador;
    }

    @Override
    public void abastecer(double litros) {
        double kwh = litros * FACTOR_RAPIDO;
        cargador.cargarKWh(kwh);
    }
}
