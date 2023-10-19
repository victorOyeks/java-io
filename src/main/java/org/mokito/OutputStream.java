package org.mokito;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStream {

    public static void main (String[] args){

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/example1.txt", true);
            char H = 'H';

//            fileOutputStream.write((char)H);

//            fileOutputStream.write(' ');

            String string = "Hello Java Network Programming";
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
