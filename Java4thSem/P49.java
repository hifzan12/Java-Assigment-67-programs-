// Declaring a Parent and child class (Single Inheritance)

class Parent{
    void display(){System.out.println("Calling from parent!");}
}

class Child extends Parent{
    void show(){System.out.println("showing from the child class!");}
}
public class P49 {
    public static void main(String [] args){
        Child c = new Child();
        c.display(); //Using parent method
        c.show();
    }
}
