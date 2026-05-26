package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoProxy implements VideoDownloader{
    private VideoDownloader videoDownloader;
    private Map<String , byte[]> cache = new HashMap<>();

    @Override
    public byte[] downloadVideo(String url) {
        if(videoDownloader == null){
            videoDownloader = new RealVideoDownloader();
        }

        if(cache.containsKey(url)){
            System.out.println("[Прокси] Найдено в кэше! Отдаем моментально: " + url);
            return cache.get(url);
        }

        byte[] video = videoDownloader.downloadVideo(url);

        cache.put(url , video);
        return video;
    }
}
