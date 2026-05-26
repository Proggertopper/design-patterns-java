package behavioral.visitor;

public class PowerReportVisitor implements Visitor{
    @Override
    public void visitComputer(Computer computer) {
        System.out.println("Отчет: ноутбук модели " + computer.getModel() + " потребляет 50Вт");
    }

    @Override
    public void visitServer(Server server) {
        System.out.println("Отчет: сервер на " + server.getCpuCores() + " ядер потребляет 600Вт");
    }
}
