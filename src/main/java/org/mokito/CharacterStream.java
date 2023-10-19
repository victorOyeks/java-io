package org.mokito;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {
    public static void main (String[] args){
        try{
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/main/resources/example4.txt"));
            InputStreamReader in = new InputStreamReader(new FileInputStream("src/main/resources/example4.txt"));

            out.write("Hello CharacterStream");
            out.close();

            int data = in.read();
            while (data != -1){
                System.out.print((char) data);
                data = in.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
