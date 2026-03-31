// using throws
import java.io.*;

public class P61 {
    public static void main(String [] args) throws IOException{
        
        try{
            FileReader file = new FileReader("dat.txt");
            file.read();
            file.close();
        }
        catch(IOException e){
            System.out.println("Error in the file opening!");
        }
        finally{
            System.out.println("Program Finished!");
        }
    }
}
