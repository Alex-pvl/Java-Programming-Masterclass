package com.alexpvl;

import static com.alexpvl.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello!")).start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted.");
                }
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from main thread.");
    }
}
