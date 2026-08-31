package dosw.taller4_patrones.ejercicio03_reportes;

// Implementa los pasos variables del Template Method para el formato PDF.
public class PdfReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato PDF (paginado, encabezados).");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando archivo reporte.pdf");
    }
}
