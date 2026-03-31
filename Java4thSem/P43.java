// Pass by value

public class P43 {
     public static void call(int x){
        x += 10; 
    }
    public static void main(String [] args){
        int x = 100;
        call(x);
        System.out.println(x);
    }
}
