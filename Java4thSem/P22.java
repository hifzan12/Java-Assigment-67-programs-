// Jump Statement : Continue

public class P22 {
    public static void main(String [] args){
        int a =10;
        int i = 1;
        while(i<=a){
            System.out.println(i);
         i++;
            if(i==3) {i++;continue;}
        }
    }
}
