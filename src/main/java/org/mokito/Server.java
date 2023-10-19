package org.mokito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main (String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("Waiting for client to connect");
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello Client");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String clientMessage = input.readLine();
        System.out.println(clientMessage);
        input.close();
        out.close();
        socket.close();
    }
}
