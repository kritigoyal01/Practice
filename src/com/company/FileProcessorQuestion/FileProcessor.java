package com.company.FileProcessorQuestion;

import java.util.Random;
import java.util.concurrent.Callable;

public class FileProcessor implements Callable {
    String name;

    public FileProcessor(String name) {
        this.name = name;
    }

    public String call() throws Exception {

        //Code for processing file
        Random generator = new Random();
        Integer statusCode = generator.nextInt(5);

        Thread.sleep(1000);

        if (statusCode == 0) {
            return name + ": Success";

        }
        if (statusCode == 1) {
            return name + ": Reading failed";

        }
        return name + ": Parsing failed";
    }
}

