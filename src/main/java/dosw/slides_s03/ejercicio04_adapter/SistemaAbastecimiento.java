package dosw.slides_s03.ejercicio04_adapter;

/**
 * Interfaz con el cliente: es la única forma en que el sistema central
 * de la gasolinería "sabe" abastecer un vehículo, sin importar si es a
 * combustión o eléctrico.
 */
public interface SistemaAbastecimiento {
    // Abastece el vehículo con la cantidad de litros indicada.
    void abastecer(double litros);
}
