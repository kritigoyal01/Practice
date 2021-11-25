package com.company.FileProcessorQuestion;

import java.util.Random;
import java.util.concurrent.*;


public class NewMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // creates five tasks
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        FutureTask[] fileParserFutureTask = new FutureTask[5];

        for (int i = 0; i < 5; i++) {

            fileParserFutureTask[i] = (FutureTask) executorService.submit(new FileProcessor("Filename: "+ i));

        }

        int numberOfFilesProcessed = 0;
        while(numberOfFilesProcessed <5) {
            // As it implements Future, we can call get()
            for(int i=0;i<5;i++){
                if(fileParserFutureTask[i].isDone()){
                    numberOfFilesProcessed++;

                    System.out.println( "Filename with status code : " + fileParserFutureTask[i].get());
                }
                else
                {
                    System.out.println("Processing File");
                }
            }


            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
        System.out.println("End");
    }
}



