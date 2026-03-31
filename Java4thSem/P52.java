// Multiple inheritance Using Interface and method overriding

interface A{
    default void display(){System.out.println("Calling from A!");}
}

interface B{
    default void display(){System.out.println("Calling from b!");}
}

class C implements A, B{
    @Override
    public void display(){System.out.println("Display from C");}
    void call(){System.out.println("Calling from the C");}
}
public class P52 {
    public static void main(String [] args){
        C c = new C();
        c.display(); 
    }
}