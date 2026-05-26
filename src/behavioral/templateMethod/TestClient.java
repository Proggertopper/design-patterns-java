package behavioral.templateMethod;

public class TestClient {
    public static void main(String[] args) {
        PdfReportGenerator pdfReportGenerator = new PdfReportGenerator();
        pdfReportGenerator.generateReport();

        HtmlReportGenerator htmlReportGenerator = new HtmlReportGenerator();
        htmlReportGenerator.generateReport();
    }
}
