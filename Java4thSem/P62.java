// Use of java IOStream (ByteStream - FileReader)
import java.io.*;
public class P62 {
    public static void main(String [] args) throws IOException{
        FileReader fout = new FileReader("data.txt");
        System.out.println((char)fout.read());
        fout.close();
    }
}
