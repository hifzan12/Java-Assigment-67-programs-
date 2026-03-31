// Synchronization

public class P67 {
    int cnt = 0;

    synchronized void increment(){
        cnt++;
    }

    public static void main(String[] args) throws Exception {
        P67 obj = new P67();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) obj.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) obj.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + obj.cnt);
    }
}