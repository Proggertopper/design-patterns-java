package creational.singleton;

public final class MultiThreadSingleton {
    private static MultiThreadSingleton instance;
    public volatile String value;

    private MultiThreadSingleton(String value){
        this.value = value;
    }

    public static MultiThreadSingleton getInstance(String value){
        MultiThreadSingleton result = instance;
        if(result != null){
            return result;
        }

        synchronized (MultiThreadSingleton.class){
            if(instance == null){
                instance = new MultiThreadSingleton(value);
            }
            return instance;
        }
    }
}
