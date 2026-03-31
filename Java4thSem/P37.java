// Deletion in an array

import java.util.Scanner;
public class P37 {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.print("Enter the key : ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
            for(int i = pos; i<a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length-1]=0;
        for(int i = 0; i<a.length; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}
