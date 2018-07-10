package Threads;

import static Threads.ThreadColor.ANSI_PURPLE;
import static Threads.ThreadColor.ANSI_GREEN;



public class Main_Thread {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from the main thread");


        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonimus class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
