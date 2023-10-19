package org.mokito;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemIn {
    public static void main (String[] args){
        System.out.print("Please enter the port number:");

        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(in);

        boolean isValid = false;
        int port = 0;

        while(!isValid){
            try{
                String portString = reader.readLine();
                port = Integer.parseInt(portString);
                System.out.println("Port is accepted!");
                isValid = true;
            }catch (Exception e){
                e.printStackTrace();
                e.getMessage();

                System.out.println("Please enter a number!");
                System.out.println("Please enter the port number!");
            }
        }
        System.out.println("Please enter Service IP address:");

        String ipAddress = "";

        try{
            ipAddress = reader.readLine();
        }catch (Exception e){
            System.out.println("Cannot read the ip address: " + e.getMessage());

            System.out.println("");
            System.out.println("_________________________________");
            System.out.println("");

            System.out.println("Trying to connect to IP: " + ipAddress + " on port: " + port + "...");
        }
    }
}
