// Polymorphism  (Compile time)

class IntSum{
    public int sum(int a, int b){return a+b;}
    public int sum(int a, int b, int c){return a+b+c;}
}

public class P55 {
    public static void main(String [] args){
        IntSum a = new IntSum();
        System.out.println("Sum 2+2 : "+a.sum(2, 2));
    }
}
