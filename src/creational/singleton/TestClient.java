package creational.singleton;

public class TestClient {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton1 = Singleton.getInstanceSingleton("Foo");
        Singleton singleton2 = Singleton.getInstanceSingleton("BOOO");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);


        Thread thread1 = new Thread(new ThreadFOO());
        Thread thread2 = new Thread(new ThreadBAM());
        thread1.start();
        thread2.start();
    }

   static class ThreadFOO extends Thread{
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("FOO");
            System.out.println("MultiThread result 1 : " + singleton.value);
        }
    }

    static class ThreadBAM extends Thread{
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("BAM");
            System.out.println("MultiThread result 2 : " + singleton.value);
        }
    }
}
