// To print the factorial of a num
public class P18_39 {
    public static void main(String [] args){
        int a =5;
        int fact = 1;
        for(int i = 1; i<=a; i++){
            fact *= i; 
        }
        System.out.println("fact = " + (fact));
    }
}
