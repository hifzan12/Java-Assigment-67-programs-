public class P68 {

    synchronized void print(){
        try{
            System.out.println("Waiting...");
            wait();   // thread waits
            System.out.println("Resumed after notify!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    synchronized void resumeThread(){
        System.out.println("Notifying...");
        notify();   // wake up waiting thread
    }

    public static void main(String[] args) throws Exception {
        P68 obj = new P68();

        Thread t1 = new Thread(() -> obj.print());
        Thread t2 = new Thread(() -> {
            try{
                Thread.sleep(1000);
            } catch(Exception e){}
            obj.resumeThread();
        });

        t1.start();
        t2.start();
    }
}