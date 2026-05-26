package behavioral.templateMethod;

public class PdfReportGenerator extends ReportGenerator{
    @Override
    protected void formatData() {
        System.out.println("Конвертация: преобразуем данные в красивый пдф формат...");
    }
}
