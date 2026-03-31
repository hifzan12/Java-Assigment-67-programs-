// // Type Casting In Java(Narrowing)
public class P11 {
    public static void main(String [] args){
        double a = 100000.234; 
        long b = (long)a;
        short c = (short)b;
        System.out.println("c : " + c);
        System.out.println("b : " + b);
    }
}
