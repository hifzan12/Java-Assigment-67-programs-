// Creating Thread

public class P65 extends Thread{
    public void run(){
        System.out.println("Thread Running!");
    }
    public static void main(String [] args){
        P65 a = new P65();
        a.start();
    }
}
