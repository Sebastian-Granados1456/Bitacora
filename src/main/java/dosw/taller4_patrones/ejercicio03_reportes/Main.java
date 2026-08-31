package dosw.taller4_patrones.ejercicio03_reportes;

/**
 * TALLER_DOSW_#4 — Ejercicio #03: Sistema de Reportes Empresariales.
 * Combina Template Method (el esqueleto de 4 pasos es fijo, solo
 * varían applyFormat/exportFile) con Factory Method (el cliente pide
 * "reporte PDF" y la Factory construye la instancia correcta). El
 * cliente llama report.generate() y el Template Method ejecuta los 4
 * pasos usando la implementación del formato elegido.
 */
public class Main {
    public static void main(String[] args) {
        ReportGenerator pdf = ReportFactory.create("PDF");
        pdf.generate();

        System.out.println();
        ReportGenerator csv = ReportFactory.create("CSV");
        csv.generate();
    }
}
