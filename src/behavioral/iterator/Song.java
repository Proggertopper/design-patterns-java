package behavioral.iterator;

public class Song {
    private String title;
    private boolean isFavourite;

    public Song(String title, boolean isFavourite) {
        this.title = title;
        this.isFavourite = isFavourite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
