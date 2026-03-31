//(Hierachical Inheritance)

class A{
    void display(){System.out.println("Calling from A!");}
}

class B extends A{
    void show(){System.out.println("showing from the B!");}
}

class C extends A{
    void call(){System.out.println("Calling from the C");}
}
public class P51 {
    public static void main(String [] args){
        C c = new C();
        c.display(); 
        c.call();

        B b = new B();
        b.display();
        b.show();
    }
}