package FileWritingAndReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        System.out.println("That is correct");
        try {
            writeText.write("First Line");

            String[] names = {"Becir", "Adnan", "Amila"};
            writeText.writeArray(names);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
class writeText {
    public static void write(String textName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
        writer.write("First Line");
        writer.close();
    }
    public static void writeArray(String[] people) throws IOException{
        BufferedWriter w = new BufferedWriter(new FileWriter("people.txt"));

        String[] names = {"Becir", "Adnan", "Amila"};
        for(String name : people) {
            w.write(w.toString());
            w.newLine();
        }
        w.close();
    }
}