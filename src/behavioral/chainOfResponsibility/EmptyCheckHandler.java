package behavioral.chainOfResponsibility;

public class EmptyCheckHandler extends Handler{
    @Override
    public boolean check(String message) {
        if(message == null || message.trim().isEmpty()){
            System.out.println("Ошибка! Сообщение пустое!");
            return false;
        }
        return next == null || next.check(message);
    }
}
