package Vjezba1512;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CheckedVSUnchecked {
    public static void main(String[] args) throws FileNotFoundException {
        readFromFile("myfile.txt");
    }
    /*private static void readFromFile(String fileName){
        try{
            FileReader reader = new FileReader (fileName);
        }
        catch (FileNotFoundException e){
            System.out.println("That file doesn't exist");
        }
    }*/

    private static void readFromFile(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);
    }
}
