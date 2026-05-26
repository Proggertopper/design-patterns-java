package behavioral.chainOfResponsibility;

public class BadWordsHandler extends Handler {
    @Override
    public boolean check(String message) {
        if (message.toLowerCase().contains("дурак")) {
            System.out.println("Ошибка: Ругательства запрещены!");
            return false; // Прерываем
        }
        return next == null || next.check(message);
    }
}
