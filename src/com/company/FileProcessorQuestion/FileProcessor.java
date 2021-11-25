package com.company.FileProcessorQuestion;

import java.util.Random;
import java.util.concurrent.Callable;

public class FileProcessor implements Callable
    {

        public Object call() throws Exception
        {
            Random generator = new Random();
            Integer randomNumber = generator.nextInt(5);

            Thread.sleep( 1000);

            return randomNumber;
        }
    }

