package com.company.StudentQuestions.StudentFileIOExample;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        StudentWithoutCriticalData studentC = new StudentWithoutCriticalData();
        Date date1=new SimpleDateFormat("dd/MM/yyyy"). parse("02/06/1998");
        studentC.setDateOfBirth(date1);
        studentC.setName("S1");
        studentC.setScore(220);
        studentC.setHouse("Blue");

        StudentMarshallingDeMarshalling studentMarshallingDeMarshalling = new StudentMarshallingDeMarshalling();
        studentMarshallingDeMarshalling.writeToFile(studentC,"studentFile.txt");

       StudentWithoutCriticalData updateObj= studentMarshallingDeMarshalling.readToFile("studentFile.txt");
        System.out.println(updateObj.getDateOfBirth());
    }

}
