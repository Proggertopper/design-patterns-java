package behavioral.chainOfResponsibility;

public class SpamCheckHandler extends Handler{
    @Override
    public boolean check(String message) {
        if(message.toLowerCase().contains("купи")){
            System.out.println("Ошибка! Обнаружен спам!");
            return false;
        }
        return next == null || next.check(message);
    }
}
