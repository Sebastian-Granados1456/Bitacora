package dosw.slides_s03.ejercicio04_adapter;

/**
 * Servicio de un proveedor externo (interfaz incompatible: carga en
 * KWh, no en litros). No se puede modificar esta clase.
 */
public class CargadorElectricoRapido {

    // Carga la cantidad de KWh indicada. Método propio del proveedor "rápido".
    public void cargarKWh(double kwh) {
        System.out.printf("Cargador rápido: entregando %.2f KWh.%n", kwh);
    }
}
