package dosw.taller4_patrones.ejercicio03_reportes;

/**
 * Factory Method: decide dinámicamente qué tipo de ReportGenerator
 * instanciar según la solicitud del cliente, que nunca instancia
 * PdfReport/ExcelReport/CsvReport directamente.
 */
public class ReportFactory {

    public static ReportGenerator create(String formato) {
        return switch (formato.toUpperCase()) {
            case "PDF" -> new PdfReport();
            case "EXCEL" -> new ExcelReport();
            case "CSV" -> new CsvReport();
            default -> throw new IllegalArgumentException("Formato de reporte no soportado: " + formato);
        };
    }
}
