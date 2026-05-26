package structural.proxy;

public class TestClient {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new CachedVideoProxy();

        System.out.println("--- Первый запрос (Прокси создаст сервис и скачает видео) ---");
        videoDownloader.downloadVideo("://youtube.com");

        System.out.println("\n--- Второй запрос того же видео (Прокси вернет его из кэша) ---");
        videoDownloader.downloadVideo("://youtube.com");

        System.out.println("\n--- Третий запрос нового видео (Прокси пойдет качать) ---");
        videoDownloader.downloadVideo("://google.com");
    }
}
