package behavioral.chainOfResponsibility;

public class TestClient {
    public static void main(String[] args) {
        Handler handler = new EmptyCheckHandler();
        Handler handler1 = new SpamCheckHandler();
        Handler handler2 = new BadWordsHandler();

        handler.setNext(handler1).setNext(handler2);

        System.out.println("--- Тест 1 ---");
        handler.check("   "); // Споткнется на первом

        System.out.println("\n--- Тест 2 ---");
        handler.check("Привет! Купи наши курсы!"); // Пройдет первый, споткнется на втором

        System.out.println("\n--- Тест 3 ---");
        handler.check("Ты дурак или как?"); // Пройдет первый и второй, споткнется на третьем

        System.out.println("\n--- Тест 4 ---");
        if (handler.check("Привет, как дела?")) {
            System.out.println("Успех: Сообщение опубликовано!"); // Пройдет всю цепочку
        }
    }
}
