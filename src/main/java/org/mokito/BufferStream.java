package org.mokito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferStream {
    public static void main(String[] args){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/example1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/example7.txt"));

            String line = null;

            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            reader.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
