public class P44 {
     public static int fact(int x){
        if(x<=1) return 1;
        return x*fact(x-1);
    }
    public static void main(String [] args){
        int x = 5;
        System.out.println(fact(x));
    }
}
