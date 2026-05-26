package behavioral.templateMethod;

public class HtmlReportGenerator extends ReportGenerator{
    @Override
    protected void formatData() {
        System.out.println("Конвертация: преобразуем данные в красивый html формат...");
    }
}
