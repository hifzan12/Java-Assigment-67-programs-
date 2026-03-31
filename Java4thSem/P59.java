// Using try catch and finallyblock

public class P59 {
    public static void main(String [] args){
        try{
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Error : Not Division by Zero!");
        }
        finally{
            System.out.println("Program Finished!");
        }
    }
}
