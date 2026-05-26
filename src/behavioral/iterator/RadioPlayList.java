package behavioral.iterator;

public class RadioPlayList implements PlayList {
    private Song[] songs;


    public RadioPlayList(Song[] songs) {
        this.songs = songs;
    }


    @Override
    public Iterator getSequentialIterator() {
        return new SequentialIterator();
    }

    @Override
    public Iterator getFavouriteIterator() {
        return new FavouriteIterator();
    }

    private class SequentialIterator implements Iterator{
        private int currentPosition =0;

        @Override
        public boolean hasNext() {
            return currentPosition < songs.length && songs[currentPosition]!= null;
        }

        @Override
        public Song next() {
            if(hasNext()){
                return songs[currentPosition++];
            }
            return null;
        }
    }

    private class FavouriteIterator implements Iterator{
        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            while(currentPosition < songs.length && songs[currentPosition] != null){
                if(songs[currentPosition].isFavourite()){
                    return true;
                }
                currentPosition++;
            }
            return false;
        }

        @Override
        public Song next() {
            if(hasNext()){
                return songs[currentPosition++];
            }
            return null;
        }
    }
}
