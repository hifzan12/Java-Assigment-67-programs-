// Using throw with Try catch block

public class P60 {
    public static void main(String [] main){
        try{
            int age = 15;
            if(age<18) throw new IllegalArgumentException("Not Elligible!");
            System.out.println("Elligible");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
