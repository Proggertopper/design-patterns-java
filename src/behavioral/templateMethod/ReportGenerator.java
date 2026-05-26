package behavioral.templateMethod;

public abstract class ReportGenerator {

    public final void generateReport(){
            loadData();
            formatData();
            sendEmail();
    }

    private void loadData(){
        System.out.println("База данных: загрузка сырых данных для отчета...");
    }

    protected abstract void formatData();

    private void sendEmail(){
        System.out.println("Email: отчет успешно отправлен директору...");
    }


}
