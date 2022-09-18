package Chat;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class FileHandeling {
    public static void main(String[] args) {

        try {
            File myObj = new File("MyFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");

                FileWriter myWriter = new FileWriter("filename.txt");
            }
        } catch (IOException e) {
            System.out.println("An error occurred."+e);

        }

        //FileWriter myWriter = new FileWriter("filename.txt");

    }
}
