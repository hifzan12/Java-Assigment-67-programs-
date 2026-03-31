// Alertnate method to create Thread (Instead of extending Thread)
public class P66 implements Runnable{
    public void run(){
        System.out.println("Thread Running!");
    }
    public static void main(String[] args){
        P66 obj = new P66();
        Thread t = new Thread(obj);
        t.start();
    }
    
}
