package dosw.taller4_patrones.ejercicio03_reportes;

// Implementa los pasos variables del Template Method para el formato Excel.
public class ExcelReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato Excel (hojas, celdas con estilo).");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo reporte.xlsx");
    }
}
