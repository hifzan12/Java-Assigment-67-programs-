// Use of java IOStream (ByteStream - FileReader)
import java.io.*;
public class P63 {
    public static void main(String [] args) throws IOException{
        FileWriter fout = new FileWriter("data.txt");
        fout.write("Hello");
        fout.close();
    }
}
