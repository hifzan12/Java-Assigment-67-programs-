// Encapsulation

class Bank{
    private double balance;
    public void deposit(double amt) {balance += amt;}
    public double getBalance(){return balance;}
}

public class P54 {
    public static void main(String [] args){
        Bank b1 = new Bank();
        System.out.println("Balance : "+b1.getBalance());
        b1.deposit(2000);
        System.out.println("Balance : "+b1.getBalance());
    }    
}
