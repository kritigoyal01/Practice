package com.company.SingletonPattern;

import java.io.IOException;

public class Main {
    static int count=1;
    public static void main(String[] args) throws IOException {

        //Instance of singletonClass
        SingletonClass jdbc= SingletonClass.getInstance();

        //Taking demo values for username and password to insert into db
        try {
            int i= jdbc.insert("username", "password");
            if (i>0) {
                System.out.println((count++) + " Data has been inserted successfully");
            }else{
                System.out.println("Data has not been inserted ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

     }

}
