// Abstraction

abstract class Shape{
    public abstract void draw();
}

class Car extends Shape{
    public void draw(){System.out.println("Drwaing Car");}
}

public class P53 {
    public static void main(String [] args){
        Car c = new Car();
        c.draw();
    }
}
