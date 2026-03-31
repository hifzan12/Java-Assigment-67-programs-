import java.io.IOException;

class Calculator{
    public int a, b;
    public int add(){return a+b;}
    public int sub(){return a-b;}
    public int multiply(){return a*b;}
    public double divide(){
        try{
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println("Division error");
            throw e;
        }
    }
}
public class P46{
    public static void main(String [] args) throws IOException{
        Calculator c1 = new Calculator();
    c1.a = 5;
    c1.b = 0;
    c1.add();
    try{
        c1.divide();
    }
    catch(Exception e){System.out.println("Division error");}
    }
    
}
