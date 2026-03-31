// File Reading using while loop

import java.io.File;
import java.io.*;
import java.util.Scanner;

class P64{
    public static void main(String [] args){
        try{
            File f = new File("data.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}