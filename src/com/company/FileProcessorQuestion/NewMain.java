package com.company.FileProcessorQuestion;

import java.util.Random;
import java.util.concurrent.*;


public class NewMain {

    public static void main(String[] args) {
        // creates five tasks

        FutureTask[] randomNumberTasks = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            Callable r1 = new FileProcessor();
            // Create the FutureTask with Callable
            randomNumberTasks[i] = new FutureTask(r1);

            // As it implements Runnable, create Thread
            // with FutureTask
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }

        for (int i = 0; i < 5; i++) {
            // As it implements Future, we can call get()
            try {
                System.out.println(randomNumberTasks[i].get());
                Integer obj  = (Integer)randomNumberTasks[i].get();
                if(obj == 0){
                    System.out.println("Parsing failed");

                }
                if(obj == 1){
                    System.out.println("Reading failed");

                }
                if(obj == 2){
                    System.out.println("Success");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
        System.out.println("End");
    }
}



