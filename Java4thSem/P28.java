// Sum of n natural num.

import java.util.Scanner;
public class P28 {
    public static void main(String [] args){
        System.out.print("Enter the input : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n*(n+1)/2));
        sc.close();
    }
}
