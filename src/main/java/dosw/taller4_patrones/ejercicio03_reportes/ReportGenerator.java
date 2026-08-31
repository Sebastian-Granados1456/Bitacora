package dosw.taller4_patrones.ejercicio03_reportes;

/**
 * Template Method: define el algoritmo fijo de 4 pasos en generate()
 * (final, no se puede sobreescribir el orden). Las subclases solo
 * implementan los pasos que varían por formato (applyFormat, export).
 */
public abstract class ReportGenerator {

    // Ejecuta los 4 pasos en orden fijo: obtener, procesar, formatear y exportar.
    public final void generate() {
        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    // Paso fijo: igual para todos los formatos.
    private void fetchData() {
        System.out.println("Obteniendo datos de la base de datos...");
    }

    // Paso fijo: igual para todos los formatos.
    private void processData() {
        System.out.println("Procesando información...");
    }

    // Paso variable: cada formato define cómo se ve el reporte.
    protected abstract void applyFormat();

    // Paso variable: cada formato define cómo se guarda el archivo.
    protected abstract void exportFile();
}
