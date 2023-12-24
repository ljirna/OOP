package FileWritingAndReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void simpleRead() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("read.txt"));
        String temp;
        while((temp = reader.readLine()) != null){
            System.out.println(temp);
        }
        reader.close();
    }
}
