package org.mokito;

public class ImplementRunnable implements Runnable {

    private int threadIndex;

    public ImplementRunnable(int index){
        this.threadIndex = index;
    }

//    @Override
//    public void run() {
//        try {
//            int clientNumber = 1;
//            while (clientNumber != 100) {
//                System.out.println("Server" + this.threadIndex + " sent data to client: " + clientNumber);
//                Thread.sleep(1000);
//                clientNumber++;
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

    @Override
    public void run() {

            int clientNumber = 1;
            while (clientNumber != 100) {
                System.out.println("Server " + this.threadIndex + " sent data to client: " + clientNumber);
                clientNumber++;
            }
    }

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}