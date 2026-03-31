// TO find the largest of the two num given by the user

import java.util.Scanner;
public class P25_27 {
    public static void main(String [] args){
        System.out.print("Enter the numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a>b)?a:b;
        System.out.println("c : " + c);
        sc.close();
    } 
}