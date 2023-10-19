package org.mokito;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        ServerThread serverThread1 = new ServerThread("Server 1");
//        ServerThread serverThread2 = new ServerThread("Server 2");
//        serverThread1.setPriority(Thread.MAX_PRIORITY);
//        serverThread1.start();
//        serverThread2.start();
        ImplementRunnable runnable1 = new ImplementRunnable(1);
        Thread thread = new Thread(runnable1);
        thread.start();

        ImplementRunnable runnable2 = new ImplementRunnable(2);
        Thread thread2 = new Thread(runnable2, "Server 2");
        System.out.println(thread2.getName());
        thread2.start();

        ImplementRunnable runnable3 = new ImplementRunnable(3);
        runnable3.start();
    }
}