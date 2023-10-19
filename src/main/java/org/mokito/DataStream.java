package org.mokito;

import java.io.*;

public class DataStream {
    public static void main (String [] args){
        File file = new File("example3.txt");
        if(file.exists()){
            System.out.println("FIle already exist: " + file.getName());

        }else {
            try{
                if(file.createNewFile()){
                    System.out.println("File has been created!");
                    System.out.println("Absolute path: " + file.getAbsolutePath());
                }else {
                    System.out.println("Cannot create file!");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));

            out.writeInt(72);
            out.writeDouble(763.63);
            out.writeFloat(123.45F);

            int var1 = in.readInt();
            double var2 = in.readDouble();
            float var3 = in.readFloat();

            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var3);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
