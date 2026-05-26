package structural.proxy;

public class RealVideoDownloader implements VideoDownloader{

    public RealVideoDownloader(){
        System.out.println("[Сервис] Установка тяжелого соединения с YouTube...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public byte[] downloadVideo(String url) {
        System.out.println("[Сервис] Скачиваем видео по ссылке "+ url + " (это долго )... ");
        return new byte[]{1 , 0 , 1 , 1 , 0};
    }
}
