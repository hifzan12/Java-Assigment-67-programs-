// Copy Constructor

class A{
    int num;
    A(){}
    A(A obj){
        this.num = obj.num;
    }
}

public class P58 {
    public static void main(String [] args){
        A a = new A();
        a.num = 10;
        A b = a;
        System.out.println(b.num); 
    }
}