// Parametrized Constructor
class A{
    int num;
    A(){}
    A(int num){
        this.num = num;
    }
}

public class P57 {
    public static void main(String [] args){
        A a = new A(10);
                System.out.println(a.num); 
    }
}