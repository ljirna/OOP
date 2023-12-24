package FileWritingAndReading;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class FileIO {
    public static void readWholeFileList() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("readingfile.txt"));
        List<String> lines = br.lines().collect(Collectors.toList());
        for(String a : lines){
            System.out.println(a);
        }
        br.close();
    }

    public static void readWholeFile() throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("readingfile.txt"));
        String tempLine;
        while((tempLine = buff.readLine()) != null){
            System.out.println(tempLine);
        }
        buff.close();
    }
    public static void arrayFileWrite(String[] people) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("writingfile.txt"));
        for(String a : people){
            bw.write(a);
        }
        bw.close();
    }

    public static void writeToFile() throws IOException{
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("First line");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        String[] names = {"Becir", "Adnan", "Amila"};
        arrayFileWrite(names);
        readWholeFile();
        readWholeFileList();
    }
}