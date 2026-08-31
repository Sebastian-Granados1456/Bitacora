package dosw.slides_s03.ejercicio04_adapter;

/**
 * Otro proveedor externo, con su propia interfaz incompatible
 * (también en KWh, pero con un método distinto al del rápido).
 */
public class CargadorElectricoLento {

    // Suministra la cantidad de KWh indicada. Método propio del proveedor "lento".
    public void suministrarKWh(double kwh) {
        System.out.printf("Cargador lento: suministrando %.2f KWh.%n", kwh);
    }
}
