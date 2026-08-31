package dosw.slides_s03.ejercicio04_adapter;

// Sistema original (ya compatible): surtidor estándar para vehículos a combustión.
public class SurtidorCombustion implements SistemaAbastecimiento {
    @Override
    public void abastecer(double litros) {
        System.out.printf("Surtidor de combustión: cargando %.1f litros.%n", litros);
    }
}
