// Inheritance for 3 classes(Multilevel Inheritance)

class A{
    void display(){System.out.println("Calling from A!");}
}

class B extends A{
    void show(){System.out.println("showing from the B!");}
}

class C extends B{
    void call(){System.out.println("Calling from the C");}
}
public class P50 {
    public static void main(String [] args){
        C c = new C();
        c.display(); 
        c.show();
        c.call();
    }
}
