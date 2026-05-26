package behavioral.iterator;

public class TestClient {
    public static void main(String[] args) {
        Song[] songs = new Song[]{new Song("vesna" , true), new Song("Autumn" , true), new Song("Winter" , false)};
        RadioPlayList radio = new RadioPlayList(songs);

        Iterator iterator = radio.getFavouriteIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
