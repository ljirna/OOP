package FileWritingAndReading;

import java.io.*;

public class Writing {
    public static void main(String[] args) {
        String[] names = {"Mirna", "Ana", "Mirela"};
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("First line");
            bw.write("Second line");
            for(String n : names){
                bw.write("\n" + n);
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
