// Table of the entered num.

import java.util.*;
public class P24 {
    public static void main(String [] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
        sc.close();
    }
}
