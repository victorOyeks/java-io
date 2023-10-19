package org.mokito;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {
    public static void main (String[] args) {

        try{
            FileInputStream inputStream = new FileInputStream("src/main/resources/example.txt");

            int data = inputStream.read();

            while(data != -1){
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
