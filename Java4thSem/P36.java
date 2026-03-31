// Searching in array
import java.util.Scanner;
public class P36 {
    public static void main(String [] args){
        int a[] = {1,2,3,4};
        System.out.print("Enter the key : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for(int i = 0; i<4; i++){
            if(a[i] == key){
                System.out.println("Found");
                sc.close();
                return;}
    }
     System.out.println("Not Found");
     sc.close();
    }
    
}
