package dosw.taller4_patrones.ejercicio03_reportes;

// Implementa los pasos variables del Template Method para el formato CSV.
public class CsvReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato CSV (valores separados por coma).");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo reporte.csv");
    }
}
